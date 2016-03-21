package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import com.prisch.messages.NoContentMessage;
import fi.iki.elonen.NanoHTTPD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer extends NanoHTTPD {

    private static final int REQUEST_TIMEOUT_SECONDS = 60;
    private static final int CONNECTION_LOST_MILLISECONDS = REQUEST_TIMEOUT_SECONDS * 1000 + 5000;
    private static final String JSON_DATA_PARAM = "postData";

    private static final Logger LOGGER = LoggerFactory.getLogger(AgentServer.class);
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

    public CompletableFuture<Message> send(Message message) {
        if (!isConnected()) {
            LOGGER.error("The client isn't connected, so unable to send the message.");
            return null; // TODO
        }

        message.setId(messageCount.addAndGet(1));

        CompletableFuture<Message> future = new CompletableFuture<>();
        futureMap.put(message.getId(), future);

        if (messageQueue.offer(message)) {
            return future;
        } else {
            LOGGER.error("The message queue is full.");
            return null; // TODO
        }
    }

    // ===== HTTP Handlers =====

    @Override
    public Response serve(IHTTPSession session) {
        if (session.getMethod() == Method.GET) {
            lastConnectionTime = System.currentTimeMillis();
            return serveCommand();
        } else if (session.getMethod() == Method.POST) {
            return serveResult(session);
        } else {
            return newFixedLengthResponse("OK");
        }
    }

    private Response serveCommand() {
        try {
            Message message = messageQueue.poll(REQUEST_TIMEOUT_SECONDS, TimeUnit.SECONDS);
            if (message == null) {
                return serveMessage(new NoContentMessage());
            } else {
                return serveMessage(message);
            }
        } catch (InterruptedException ex) {
            LOGGER.error(ex.getMessage(), ex);
            return newFixedLengthResponse(Response.Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Server thread was interrupted.");
        }
    }

    private Response serveResult(IHTTPSession session) {
        String messageJson;
        try {
            Map<String, String> requestParams = new HashMap<>();
            session.parseBody(requestParams);
            messageJson = requestParams.get(JSON_DATA_PARAM);
        } catch (IOException | ResponseException ex) {
            LOGGER.error(ex.getMessage(), ex);
            return newFixedLengthResponse(Response.Status.INTERNAL_ERROR, MIME_PLAINTEXT, "Unable to parse parameters.");
        }

        Class<? extends Message> messageClass = MessageMapping.responseMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        if (futureMap.containsKey(message.getId())) {
            futureMap.get(message.getId()).complete(message);
        }

        return newFixedLengthResponse("Successfully parsed result.");
    }

    private Response serveMessage(Message message) {
        String messageJson = GSON.toJson(message);
        return newFixedLengthResponse(messageJson);
    }

    public boolean isConnected() {
        return (System.currentTimeMillis() - lastConnectionTime < CONNECTION_LOST_MILLISECONDS);
    }
}
