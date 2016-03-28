package com.prisch.parsers;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SlackMessageParserForTicketDetailsTest {

    @Test
    public void shouldParsePlainTicketNumber() {
        Optional<Message> result = SlackMessageParser.parse("ENH105413");
        TicketDetails.Request request = assertTypeAndCast(result);
        assertFalse(request.isNotesIncluded());
    }

    @Test
    public void shouldParseTicketNumberWithVerb() {
        List<Optional<Message>> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413"));
        results.add(SlackMessageParser.parse("display ENH105413"));

        results.stream().map(this::assertTypeAndCast)
                .forEach(result -> assertFalse(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithNotes() {
        List<Optional<Message>> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("ENH105413 with notes"));
        results.add(SlackMessageParser.parse("ENH105413 and notes"));
        results.add(SlackMessageParser.parse("ENH105413 & notes"));

        results.stream().map(this::assertTypeAndCast)
                        .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldParseTicketNumberWithVerbAndNotes() {
        List<Optional<Message>> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("show ENH105413 with notes"));
        results.add(SlackMessageParser.parse("display ENH105413 and notes"));
        results.add(SlackMessageParser.parse("show ENH105413 & notes"));

        results.stream().map(this::assertTypeAndCast)
                .forEach(result -> assertTrue(result.isNotesIncluded()));
    }

    @Test
    public void shouldIgnoreCase() {
        List<Optional<Message>> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("SHow enh105413"));
        results.add(SlackMessageParser.parse("disPLAY enh105413"));

        results.stream().forEach(this::assertTypeAndCast);
    }

    @Test
    public void shouldRejectInvalidTickets() {
        List<Optional<Message>> results = new LinkedList<>();
        results.add(SlackMessageParser.parse("105413"));
        results.add(SlackMessageParser.parse("show ENH105"));
        results.add(SlackMessageParser.parse("display ENH105413a"));

        results.stream().forEach(result -> assertFalse(result.isPresent()));
    }

    private TicketDetails.Request assertTypeAndCast(Optional<Message> result) {
        assertTrue(result.isPresent());
        assertTrue(result.get() instanceof TicketDetails.Request);
        return (TicketDetails.Request)result.get();
    }

}