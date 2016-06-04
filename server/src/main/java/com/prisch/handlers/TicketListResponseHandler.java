package com.prisch.handlers;

import com.prisch.messages.TicketList;
import com.prisch.slack.SlackSession;
import com.ullink.slack.simpleslackapi.SlackChannel;

import static com.prisch.slack.SlackFormatter.*;

public class TicketListResponseHandler {

    private final SlackSession slackSession;
    private final SlackChannel slackChannel;

    public TicketListResponseHandler(SlackSession slackSession, SlackChannel slackChannel) {
        this.slackSession = slackSession;
        this.slackChannel = slackChannel;
    }

    public void process(TicketList.Response response) {
        StringBuilder stringBuilder = new StringBuilder();

        if (response.getTickets().isEmpty()) {
            stringBuilder.append(italics("You do not have any assigned tickets."));
        } else {
            stringBuilder.append(italics("Your tickets:"));
            stringBuilder.append(newline());
            stringBuilder.append(newline());

            for (TicketList.Ticket ticket : response.getTickets()) {
                stringBuilder.append(String.format("%s: %s (%s)", bold(ticket.getTicketNumber()), ticket.getTitle(), ticket.getState()));
                stringBuilder.append(newline());
            }
        }

        String slackMessage = escape(stringBuilder.toString());
        slackSession.sendMessage(slackChannel, slackMessage);
    }
}
