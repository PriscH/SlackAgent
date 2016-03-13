package com.prisch;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.prisch.handlers.MessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.messages.MessageMapping;
import org.apache.http.HttpHost;
import org.apache.log4j.Logger;

import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AgentClient {

    private static final int HTTP_OK = 200;

    private static final Logger LOGGER = Logger.getLogger(AgentClient.class);
    private static final Gson GSON = new Gson();

    private final String serverAddress;
    private final ExecutorService executor = Executors.newCachedThreadPool();

    public AgentClient(String serverAddress) throws URISyntaxException {
        this.serverAddress = serverAddress;
        Unirest.setTimeouts(10000L, 120000L);

        Unirest.setProxy(new HttpHost("proxy-eur.dmz.int.slb.atosorigin-asp.com", 8080));
    }

    // ===== Interface =====

    public void connect() {
        while (true) {
            try {
                HttpResponse<String> response = Unirest.get(serverAddress).asString();
                if (response.getStatus() == HTTP_OK) {
                    LOGGER.info(response.getBody());
                    executor.submit(new CommandHandler(response.getBody()));
                }
            } catch (UnirestException ex) {
                LOGGER.error(ex);
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

            Message response = MessageHandlerFactory.handle(message);
            String responseJson = GSON.toJson(response);

            try {
                Unirest.post(serverAddress).body(responseJson).asString();
            } catch (UnirestException ex) {
                LOGGER.error(ex);
            }
        }
    }
}
