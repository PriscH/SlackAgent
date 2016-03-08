package com.prisch;

import com.google.gson.Gson;
import com.prisch.handlers.MessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;

public class AgentClient extends WebSocketClient {

    private static final Gson GSON = new Gson();

    public AgentClient(String address) throws URISyntaxException {
        super(new URI(address));
    }

    // ===== Inherited Operations =====

    @Override
    public void onMessage(String messageJson) {
        System.out.println("Client message: " + messageJson);

        Class<? extends Message> messageClass = MessageMapping.requestMappingFor(messageJson);
        Message message = GSON.fromJson(messageJson, messageClass);

        Message response = MessageHandlerFactory.handle(message);
        String responseJson = GSON.toJson(response);

        send(responseJson);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
    }

    @Override
    public void onError(Exception ex) {
    }
}
