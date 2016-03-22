package com.prisch;

import com.prisch.handlers.ServerMessageHandlerFactory;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
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
        agentServer = new AgentServer(serverHost, serverPort);
        slackSession = SlackSessionFactory.createWebSocketSlackSession(slackToken);
        messageHandlerFactory = new ServerMessageHandlerFactory(slackSession);
    }

    private void start() throws Exception {
        slackSession.addMessagePostedListener(new SlackDirectMessageListener(this));

        agentServer.start();
        slackSession.connect();
    }

    // ===== Interface =====

    public void handleTicketDetails(String ticketNumber, SlackChannel slackChannel, String placeholderTimestamp) {
        TicketDetails.Request request = new TicketDetails.Request();
        request.setTicketNumber(ticketNumber);

        CompletableFuture<Message> future = agentServer.send(request);
        future.thenAcceptAsync(response -> messageHandlerFactory.handle(response, slackChannel, placeholderTimestamp));
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
