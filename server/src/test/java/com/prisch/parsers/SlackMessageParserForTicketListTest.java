package com.prisch.parsers;

import com.prisch.messages.TicketList;
import com.prisch.slack.TestSlackMessage;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SlackMessageParserForTicketListTest {

    @Test
    public void shouldParseMyTickets() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("my tickets").withSenderUsername("Jaco").build()));
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("my issues").withSenderUsername("Jaco").build()));
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("show my tickets").withSenderUsername("Jaco").build()));
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("show my issues").withSenderUsername("Jaco").build()));
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("my ticket").withSenderUsername("Jaco").build()));
        results.add(SlackMessageParser.parse(new TestSlackMessage.Builder().withText("show my issue").withSenderUsername("Jaco").build()));

        results.stream().map(this::assertMessageTypeAndCast)
                        .forEach(result -> assertTrue(result.getUsername().equals("Jaco")));
    }

    private TicketList.Request assertMessageTypeAndCast(ParsedResult result) {
        assertTrue(result.hasMessage());
        assertTrue(result.getMessage() instanceof TicketList.Request);
        return (TicketList.Request)result.getMessage();
    }
}
