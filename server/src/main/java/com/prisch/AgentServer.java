package com.prisch;

import com.google.gson.Gson;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AgentServer extends WebSocketServer {

    private static final Gson GSON = new Gson();

    private Map<Integer, CompletableFuture<Message>> futureMap = new HashMap<>();
    private AtomicInteger messageCount = new AtomicInteger();

    private Optional<WebSocket> connection = Optional.empty();

    public AgentServer(String address, int port) {
        super(new InetSocketAddress(address, port));
    }

    // ===== Interface =====

    public Future<Message> send(Message message) {
        synchronized (connection) {
            if (!isConnected()) {
                throw new IllegalStateException("No open connection.");
            }

            message.setId(messageCount.addAndGet(1));

            CompletableFuture<Message> future = new CompletableFuture<>();
            futureMap.put(message.getId(), future);

            String messageJson = GSON.toJson(message);
            connection.get().send(messageJson);

            return future;
        }
    }

    public boolean isConnected() {
        return connection.isPresent();
    }

    // ===== Inherited Operations =====

    @Override
    public void onMessage(WebSocket connection, String messageJson) {
        System.out.println("Client message: " + messageJson);

        Class<? extends Message> messageClass = MessageMapping.responseMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        if (futureMap.containsKey(message.getId())) {
            futureMap.get(message.getId()).complete(message);
        }
    }

    @Override
    public void onOpen(WebSocket connection, ClientHandshake handshake) {
        this.connection = Optional.of(connection);
    }

    @Override
    public void onClose(WebSocket connection, int code, String reason, boolean remote) {
        this.connection = Optional.empty();
    }

    @Override
    public void onError(WebSocket connection, Exception ex) {
        this.connection = Optional.empty();
    }
}
