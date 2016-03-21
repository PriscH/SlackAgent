package com.prisch;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.prisch.handlers.MessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import org.apache.http.HttpHost;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AgentClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(AgentClient.class);
    private static final Gson GSON = new Gson();

    private final String serverAddress;
    private final MessageHandlerFactory messageHandlerFactory;

    private final ExecutorService executor = Executors.newCachedThreadPool();

    public AgentClient(String serverAddress, Optional<HttpHost> proxy, MessageHandlerFactory messageHandlerFactory) throws URISyntaxException {
        this.serverAddress = serverAddress;
        this.messageHandlerFactory = messageHandlerFactory;

        Unirest.setTimeouts(5000L, 120000L);
        if (proxy.isPresent()) {
            Unirest.setProxy(proxy.get());
        }
    }

    // ===== Interface =====

    public void connect() {
        while (true) {
            try {
                HttpResponse<String> response = Unirest.get(serverAddress).asString();
                if (!MessageMapping.hasNoContent(response.getBody())) {
                    executor.submit(new CommandHandler(response.getBody()));
                }
            } catch (UnirestException ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
    }

    // ===== Response Handlers

    private final class CommandHandler implements Runnable {
        private final String messageJson;

        public CommandHandler(String messageJson) {
            this.messageJson = messageJson;
        }

        @Override
        public void run() {
            Class<? extends Message> messageClass = MessageMapping.requestMappingFor(messageJson);
            Message message = GSON.fromJson(messageJson, messageClass);

            Message response = messageHandlerFactory.handle(message);
            String responseJson = GSON.toJson(response);

            try {
                Unirest.post(serverAddress).body(responseJson).asString();
            } catch (UnirestException ex) {
                LOGGER.error(ex.getMessage(), ex);
            }
        }
    }
}
