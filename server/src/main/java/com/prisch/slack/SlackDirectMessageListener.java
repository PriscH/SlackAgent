package com.prisch.slack;

import com.prisch.Bot;
import com.prisch.parsers.ParsedResult;
import com.prisch.parsers.SlackMessageParser;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlackDirectMessageListener implements SlackMessagePostedListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SlackDirectMessageListener.class);

    private final Bot bot;

    public SlackDirectMessageListener(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void onEvent(SlackMessagePosted event, SlackSession rawSlackSession) {
        com.prisch.slack.SlackSession slackSession = com.prisch.slack.SlackSession.wrap(rawSlackSession);

        try {
            if (event.getChannel().isDirect() && !event.getSender().isBot()) {
                String senderName = event.getSender().getRealName().trim().isEmpty() ? event.getSender().getUserName() : event.getSender().getRealName();

                ParsedResult result = SlackMessageParser.parse(event.getMessageContent(), senderName);
                if (result.hasResponder()) {
                    result.getResponder().respond(slackSession, event.getChannel());
                } else if (result.hasMessage()) {
                    bot.sendRequest(result.getMessage(), event.getChannel());
                } else {
                    slackSession.sendMessage(event.getChannel(), "Sorry, my vocabulary and abilities are still very limited. Please give me a valid ticket number and I'll find it for you.");
                }
            }
        } catch (RuntimeException ex) {
            // The listener swallows Exceptions, so make sure we print it first
            LOGGER.error(ex.getMessage(), ex);
            throw ex;
        }
    }
}
