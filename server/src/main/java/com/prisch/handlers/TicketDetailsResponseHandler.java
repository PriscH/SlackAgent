package com.prisch.handlers;

import com.prisch.messages.TicketDetails;
import com.ullink.slack.simpleslackapi.SlackChannel;
import com.ullink.slack.simpleslackapi.SlackSession;

import static com.prisch.slack.SlackFormatter.bold;
import static com.prisch.slack.SlackFormatter.escape;

public class TicketDetailsResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    public TicketDetailsResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    public void process(TicketDetails.Response response) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s (%s)\n", bold(escape(response.getTitle())), response.getState()));
        stringBuilder.append(String.format("```%s```\n", escape(response.getDescription())));
        stringBuilder.append(String.format("`%s`", escape(response.getUrl())));

        String slackMessage = stringBuilder.toString();
        slackSession.sendMessage(slackChannel, slackMessage, null);
    }

}
