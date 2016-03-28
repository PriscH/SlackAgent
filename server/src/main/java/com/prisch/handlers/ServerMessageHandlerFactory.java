package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;

public class ServerMessageHandlerFactory {

    private final SlackSession slackSession;

    public ServerMessageHandlerFactory(SlackSession slackSession) {
        this.slackSession = slackSession;
    }

    public void handle(Message response, SlackChannel slackChannel) {
        if (response instanceof FailureResponse) {
            new FailureResponseHandler(slackSession, slackChannel).process((FailureResponse)response);
        } else if (response instanceof TicketDetails.Response) {
            new TicketDetailsResponseHandler(slackSession, slackChannel).process((TicketDetails.Response)response);
        } else {
            throw new IllegalStateException("Unknown message: " + response.getClass().getName());
        }
    }
}
