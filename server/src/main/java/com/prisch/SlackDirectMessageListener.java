package com.prisch;

import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlackDirectMessageListener implements SlackMessagePostedListener {

    private static final Pattern TICKET_PATTERN = Pattern.compile("[a-zA-Z]{3}[0-9]{6}");

    private final Bot bot;

    public SlackDirectMessageListener(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void onEvent(SlackMessagePosted event, SlackSession session) {
        if (event.getChannel().isDirect() && !event.getSender().isBot()) {
            Matcher ticketMatcher = TICKET_PATTERN.matcher(event.getMessageContent());
            if (ticketMatcher.find()) {
                String ticketNumber = ticketMatcher.group();
                bot.handleTicketDetails(ticketNumber, event.getChannel());
            }
        }
    }
}
