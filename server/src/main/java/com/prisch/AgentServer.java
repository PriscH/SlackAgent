package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import fi.iki.elonen.NanoHTTPD;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer extends NanoHTTPD {

    private static final int REQUEST_TIMEOUT_SECONDS = 60;
    private static final int CONNECTION_LOST_MILLISECONDS = REQUEST_TIMEOUT_SECONDS * 1000 + 10000;
    private static final String JSON_DATA_PARAM = "postData";

    private static final Logger LOGGER = Logger.getLogger(AgentServer.class);
    private static final Gson GSON = new Gson();

    private Map<Integer, CompletableFuture<Message>> futureMap = new HashMap<>();
    private BlockingQueue<Message> messageQueue = new ArrayBlockingQueue<>(5);
    private AtomicInteger messageCount = new AtomicInteger();

    private long lastConnectionTime;

    public AgentServer(String address, int port) {
        super(address, port);
    }

    // ===== Interface =====

    public void start() throws IOException {
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        LOGGER.info("Server running on " + getHostname() + ":" + getListeningPort());
    }

    public Future<Message> send(Message message) {
        if (!isConnected()) {
            return null;
        }

        message.setId(messageCount.addAndGet(1));

        CompletableFuture<Message> future = new CompletableFuture<>();
        futureMap.put(message.getId(), future);

        if (messageQueue.offer(message)) {
            return future;
        } else {
            return null;
        }
    }

    // ===== HTTP Handlers =====

    @Override
    public Response serve(IHTTPSession session) {
        LOGGER.info("Received message: " + session.getMethod());
        lastConnectionTime = System.currentTimeMillis();
        if (session.getMethod() == Method.GET) {
            return serveCommand();
        } else {
            return serveResult(session);
        }
    }

    private Response serveCommand() {
        try {
            Message message = messageQueue.poll(REQUEST_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (message == null) {
                return newFixedLengthResponse(Response.Status.NO_CONTENT, NanoHTTPD.MIME_PLAINTEXT, "Request timed out prior to receiving a command.");
            } else {
                String messageJson = GSON.toJson(message);
                return newFixedLengthResponse(messageJson);
            }
        } catch (InterruptedException ex) {
            LOGGER.error(ex);
        }
        return newFixedLengthResponse(Response.Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Server thread was interrupted.");
    }

    private Response serveResult(IHTTPSession session) {
        String messageJson = "";
        try {
            Map<String, String> requestParams = new HashMap<>();
            session.parseBody(requestParams);
            messageJson = requestParams.get(JSON_DATA_PARAM);
        } catch (IOException | ResponseException ex) {
            LOGGER.error(ex);
        }

        Class<? extends Message> messageClass = MessageMapping.responseMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        if (futureMap.containsKey(message.getId())) {
            futureMap.get(message.getId()).complete(message);
        }

        return newFixedLengthResponse("Successfully parsed result.");
    }

    public boolean isConnected() {
        return (System.currentTimeMillis() - lastConnectionTime < CONNECTION_LOST_MILLISECONDS);
    }
}
