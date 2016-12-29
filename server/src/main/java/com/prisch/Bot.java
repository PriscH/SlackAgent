package com.prisch;

import com.prisch.handlers.ServerMessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.slack.SlackDirectMessageListener;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class Bot {

    private final AgentServer agentServer;
    private final SlackSession slackSession;
    private final ServerMessageHandlerFactory messageHandlerFactory;

    private Bot(String serverHost, int serverPort, String slackToken) {
        slackSession = SlackSessionFactory.createWebSocketSlackSession(slackToken);
        messageHandlerFactory = new ServerMessageHandlerFactory(slackSession);
        agentServer = new AgentServer(serverHost, serverPort, slackSession);
    }

    private void start() throws Exception {
        slackSession.addMessagePostedListener(new SlackDirectMessageListener(this));

        agentServer.start();
        slackSession.connect();
    }

    // ===== Interface =====

    public void sendRequest(Message request, SlackChannel slackChannel) {
        CompletableFuture<Message> future = agentServer.send(request);
        future.thenAcceptAsync(response -> messageHandlerFactory.handle(response, slackChannel));
    }

    // ===== Main =====

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        try (final InputStream propertyStream = Bot.class.getResourceAsStream("/server.properties")) {
            properties.load(propertyStream);
        }

        String serverHost = properties.getProperty("server.host");
        int serverPort = Integer.parseInt(properties.getProperty("server.port"));
        String slackToken = properties.getProperty("slack.token");

        Bot bot = new Bot(serverHost, serverPort, slackToken);
        bot.start();
    }
}
