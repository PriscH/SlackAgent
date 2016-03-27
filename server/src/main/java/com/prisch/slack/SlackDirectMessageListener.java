package com.prisch.slack;

import com.prisch.Bot;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlackDirectMessageListener implements SlackMessagePostedListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SlackDirectMessageListener.class);

    private static final Pattern TICKET_PATTERN = Pattern.compile("[a-zA-Z]{3}[0-9]{6}");

    private final Bot bot;

    public SlackDirectMessageListener(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void onEvent(SlackMessagePosted event, SlackSession slackSession) {
        try {
            if (event.getChannel().isDirect() && !event.getSender().isBot()) {
                Matcher ticketMatcher = TICKET_PATTERN.matcher(event.getMessageContent());
                if (ticketMatcher.find()) {
                    String ticketNumber = ticketMatcher.group();
                    bot.handleTicketDetails(ticketNumber, event.getChannel());
                } else {
                    slackSession.sendMessage(event.getChannel(), "Sorry, my vocabulary and abilities are still very limited. Please give me a valid ticket number and I'll find it for you.", null);
                }
            }
        } catch (RuntimeException ex) {
            // The listener swallows Exceptions, so make sure we print it first
            LOGGER.error(ex.getMessage(), ex);
            throw ex;
        }
    }
}
