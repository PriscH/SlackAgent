package com.prisch.parsers;

import com.prisch.messages.TicketDetails;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SlackMessageParserForTicketDetailsTest {

    @Test
    public void shouldParsePlainTicketNumber() {
        ParsedResult result = SlackMessageParser.parse("ENH105413", null);
        TicketDetails.Request request = assertMessageTypeAndCast(result);
        assertFalse(request.isNotesIncluded());
    }

    @Test
    public void shouldParseTicketNumberWithVerb() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413", null));
        results.add(SlackMessageParser.parse("display ENH105413", null));

        results.stream().map(this::assertMessageTypeAndCast)
                .forEach(result -> assertFalse(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithNotes() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("ENH105413 with notes", null));
        results.add(SlackMessageParser.parse("ENH105413 and notes", null));
        results.add(SlackMessageParser.parse("ENH105413 & notes", null));

        results.stream().map(this::assertMessageTypeAndCast)
                        .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithVerbAndNotes() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413 with notes", null));
        results.add(SlackMessageParser.parse("display ENH105413 and notes", null));
        results.add(SlackMessageParser.parse("show ENH105413 & notes", null));

        results.stream().map(this::assertMessageTypeAndCast)
                .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberForSharing() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413 to <@ABC123DEF>", "Jaco"));
        results.add(SlackMessageParser.parse("share ENH105413 with <@ABC123DEF>", "Jaco"));

        results.stream().map(this::assertMessageTypeAndCast)
                        .forEach(result -> {
                            assertTrue(result.getUserReference().get().equals("ABC123DEF"));
                            assertTrue(result.getSenderName().get().equals("Jaco"));
                        });
    }

    @Test
    public void shouldParseUserReferenceForSharing() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("share ENH105413 with <@ABC123DEF>", "Jaco"));
        results.add(SlackMessageParser.parse("share ENH105413 with <@A12345678>", "Jaco"));
        results.add(SlackMessageParser.parse("share ENH105413 with <@A1A1A1A1A>", "Jaco"));
        results.add(SlackMessageParser.parse("share ENH105413 with <@ZX12ZX123>", "Jaco"));

        results.stream().map(this::assertMessageTypeAndCast)
                        .forEach(result -> assertTrue(result.getUserReference().isPresent()));
    }

    @Test
    public void shouldIgnoreCase() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("SHow enh105413", null));
        results.add(SlackMessageParser.parse("disPLAY enh105413", null));

        results.stream().forEach(this::assertMessageTypeAndCast);
    }

    @Test
    public void shouldRejectInvalidTickets() {
        List<ParsedResult> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("105413", null));
        results.add(SlackMessageParser.parse("show ENH105", null));
        results.add(SlackMessageParser.parse("display ENH105413a", null));

        results.stream().forEach(result -> assertFalse(result.hasMessage()));
    }

    private TicketDetails.Request assertMessageTypeAndCast(ParsedResult result) {
        assertTrue(result.hasMessage());
        assertTrue(result.getMessage() instanceof TicketDetails.Request);
        return (TicketDetails.Request)result.getMessage();
    }
}