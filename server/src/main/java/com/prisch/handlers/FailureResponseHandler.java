package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class FailureResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    public FailureResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    public void process(FailureResponse response) {
        slackSession.sendMessage(slackChannel, response.getMessage(), null);
    }
}
