package com.prisch.slack;

import com.prisch.Bot;
import com.prisch.messages.Message;
import com.prisch.parsers.SlackMessageParser;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.events.SlackMessagePosted;
import com.ullink.slack.simpleslackapi.listeners.SlackMessagePostedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SlackDirectMessageListener implements SlackMessagePostedListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(SlackDirectMessageListener.class);

    private final Bot bot;

    public SlackDirectMessageListener(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void onEvent(SlackMessagePosted event, SlackSession slackSession) {
        try {
            if (event.getChannel().isDirect() && !event.getSender().isBot()) {
                Optional<Message> request = SlackMessageParser.parse(event.getMessageContent());
                if (request.isPresent()) {
                    bot.sendRequest(request.get(), event.getChannel());
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
