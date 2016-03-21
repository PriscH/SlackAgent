package com.prisch;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.impl.SlackSessionFactory;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bot {

    private final AgentServer agentServer;
    private final SlackSession slackSession;

    private final ExecutorService executor = Executors.newCachedThreadPool();

    private Bot(String serverHost, int serverPort, String slackToken) {
        agentServer = new AgentServer(serverHost, serverPort);
        slackSession = SlackSessionFactory.createWebSocketSlackSession(slackToken);
    }

    private void start() throws Exception {
        slackSession.addMessagePostedListener(new SlackDirectMessageListener(this));

        agentServer.start();
        slackSession.connect();
    }

    // ===== Interface =====

    public void handleTicketDetails(String ticketNumber, SlackChannel slackChannel) {
        TicketDetails.Request request = new TicketDetails.Request();
        request.setTicketNumber(ticketNumber);
        CompletableFuture<Message> future = agentServer.send(request);

        future.thenAcceptAsync(response -> {
            String slackMessage = SlackFormatter.formatTicketDetails((TicketDetails.Response)response);
            slackSession.sendMessage(slackChannel, slackMessage, null);
        }, executor);
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
