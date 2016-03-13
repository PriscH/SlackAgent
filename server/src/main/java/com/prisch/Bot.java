package com.prisch;

import com.prisch.messages.TicketDetails;
import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;

import java.io.IOException;
import java.util.Random;

public class Bot {

    private static final String[] TASKS = {
            "Help with documentation",
            "Performance improvements on the reports",
            "Troubleshoot the i-District interface",
            "Deploy to DEV",
            "Reintegrate the branch"
    };

    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws IOException, InterruptedException {
        /*
        SlackSession session = SlackSessionFactory.createWebSocketSlackSession("xoxb-23800751190-BueL6xAziOVuZM0I5I7nyU1B");
        session.addMessagePostedListener(new BasicSlackListener());
        session.connect();
        */

        AgentServer server = new AgentServer("localhost", 8080);
        server.start();

        while (true) {
            Thread.sleep(5000L);

            if (server.isConnected()) {
                server.send(new TicketDetails.Request());
            }
        }
    }

    private static final class BasicSlackListener implements SlackMessagePostedListener {

        public void onEvent(SlackMessagePosted event, SlackSession session) {
            String botId = session.sessionPersona().getId();

            if (!event.getSender().isBot() && event.getMessageContent().contains(botId)) {
                SlackMessageHandle handle = session.sendMessage(event.getChannel(), TASKS[RANDOM.nextInt(5)], null);
            }
        }
    }
}
