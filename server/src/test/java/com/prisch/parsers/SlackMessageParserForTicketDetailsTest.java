package com.prisch.parsers;

import com.prisch.messages.TicketDetails;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SlackMessageParserForTicketDetailsTest {

    @Test
    public void shouldParsePlainTicketNumber() {
        ParsedResult result = SlackMessageParser.parse("ENH105413");
        TicketDetails.Request request = assertMessageTypeAndCast(result);
        assertFalse(request.isNotesIncluded());
    }

    @Test
    public void shouldParseTicketNumberWithVerb() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413"));
        results.add(SlackMessageParser.parse("display ENH105413"));

        results.stream().map(this::assertMessageTypeAndCast)
                .forEach(result -> assertFalse(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithNotes() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("ENH105413 with notes"));
        results.add(SlackMessageParser.parse("ENH105413 and notes"));
        results.add(SlackMessageParser.parse("ENH105413 & notes"));

        results.stream().map(this::assertMessageTypeAndCast)
                        .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithVerbAndNotes() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413 with notes"));
        results.add(SlackMessageParser.parse("display ENH105413 and notes"));
        results.add(SlackMessageParser.parse("show ENH105413 & notes"));

        results.stream().map(this::assertMessageTypeAndCast)
                .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldIgnoreCase() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("SHow enh105413"));
        results.add(SlackMessageParser.parse("disPLAY enh105413"));

        results.stream().forEach(this::assertMessageTypeAndCast);
    }

    @Test
    public void shouldRejectInvalidTickets() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("105413"));
        results.add(SlackMessageParser.parse("show ENH105"));
        results.add(SlackMessageParser.parse("display ENH105413a"));

        results.stream().forEach(result -> assertFalse(result.hasMessage()));
    }

    private TicketDetails.Request assertMessageTypeAndCast(ParsedResult result) {
        assertTrue(result.hasMessage());
        assertTrue(result.getMessage() instanceof TicketDetails.Request);
        return (TicketDetails.Request)result.getMessage();
    }
}