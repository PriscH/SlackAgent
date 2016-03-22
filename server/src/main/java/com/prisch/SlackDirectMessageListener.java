package com.prisch;

import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import com.ullink.slack.simpleslackapi.replies.GenericSlackReply;
import com.ullink.slack.simpleslackapi.replies.SlackMessageReply;
import com.ullink.slack.simpleslackapi.replies.SlackReply;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlackDirectMessageListener implements SlackMessagePostedListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SlackDirectMessageListener.class);

    private static final Pattern TICKET_PATTERN = Pattern.compile("[a-zA-Z]{3}[0-9]{6}");
    private static final String TIMESTAMP_KEY = "ts";

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
                    SlackMessageHandle<? extends SlackReply> placeholderMessageHandle = slackSession.sendMessage(event.getChannel(), "I'm checking for you, this might take a few seconds...", null);

                    String ticketNumber = ticketMatcher.group();
                    bot.handleTicketDetails(ticketNumber, event.getChannel(), getReplyTimestamp(placeholderMessageHandle.getReply()));
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

    // The library doesn't handle message replies correctly, so we have to work with the generic object
    private String getReplyTimestamp(SlackReply slackReply) {
        GenericSlackReply genericSlackReply = (GenericSlackReply)slackReply;
        return genericSlackReply.getPlainAnswer().get(TIMESTAMP_KEY).toString();
    }
}
