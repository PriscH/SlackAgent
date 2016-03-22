package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackMessageHandle;
import com.ullink.slack.simpleslackapi.SlackSession;
import com.ullink.slack.simpleslackapi.replies.SlackMessageReply;

public class ServerMessageHandlerFactory {

    private final SlackSession slackSession;

    public ServerMessageHandlerFactory(SlackSession slackSession) {
        this.slackSession = slackSession;
    }

    public void handle(Message response, SlackChannel slackChannel, String placeholderHandle) {
        String slackMessage;
        if (response instanceof FailureResponse) {
            slackMessage = ((FailureResponse)response).getMessage();
        } else if (response instanceof TicketDetails.Response) {
            slackMessage = SlackFormatter.formatTicketDetails((TicketDetails.Response)response);
        } else {
            throw new IllegalStateException("Unknown message: " + response.getClass().getName());
        }

        slackSession.updateMessage(placeholderHandle, slackChannel, slackMessage);
    }

}
