package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

public class ServerMessageHandlerFactory {

    private final SlackSession slackSession;

    public ServerMessageHandlerFactory(SlackSession slackSession) {
        this.slackSession = slackSession;
    }

    public void handle(Message response, SlackChannel slackChannel) {
        String slackMessage;
        if (response instanceof FailureResponse) {
            slackMessage = ((FailureResponse)response).getMessage();
        } else if (response instanceof TicketDetails.Response) {
            slackMessage = SlackFormatter.formatTicketDetails((TicketDetails.Response)response);
        } else {
            throw new IllegalStateException("Unknown message: " + response.getClass().getName());
        }

        slackSession.sendMessage(slackChannel, slackMessage, null);
    }

}
