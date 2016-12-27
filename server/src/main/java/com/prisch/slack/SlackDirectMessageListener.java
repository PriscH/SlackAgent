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
    public void onEvent(SlackMessagePosted messagePostEvent, SlackSession slackSession) {
        try {
            if (messagePostEvent.getChannel().isDirect() && !messagePostEvent.getSender().isBot()) {
                ParsedResult result = SlackMessageParser.parse(SlackMessage.from(messagePostEvent));
                if (result.hasResponder()) {
                    result.getResponder().respond(slackSession, messagePostEvent.getChannel());
                } else if (result.hasMessage()) {
                    bot.sendRequest(result.getMessage(), messagePostEvent.getChannel());
                } else {
                    slackSession.sendMessage(messagePostEvent.getChannel(), "Sorry, my vocabulary and abilities are still very limited. Please give me a valid ticket number and I'll find it for you.");
                }
            }
        } catch (RuntimeException ex) {
            // The listener swallows Exceptions, so make sure we print it first
            LOGGER.error(ex.getMessage(), ex);
            throw ex;
        }
    }
}
