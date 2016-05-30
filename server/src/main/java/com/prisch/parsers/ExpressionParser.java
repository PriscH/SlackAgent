package com.prisch.parsers;

import com.prisch.factories.RequestFactory;
import com.prisch.responders.ChangelogResponder;
import com.prisch.responders.HelpResponder;

import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ExpressionParser {

    TICKET ((expression, senderName) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    HELP ((expression, senderName) -> ParsedResult.with(new HelpResponder())),
    SHOW_CHANGELOG ((expression, senderName) -> ParsedResult.with(new ChangelogResponder())),

    SHOW_TICKET ((expression, senderName) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    SHOW_TICKET_WITH_NOTES ((expression, senderName) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsWithNotesRequest(ticketNumber));
    }),

    SHARE_TICKET ((expression, senderName) -> {
        String ticketNumber = extractTicketNumber(expression);
        String userReference = extractUserReference(expression);

        return ParsedResult.with(RequestFactory.buildTicketDetailsForSharingRequest(ticketNumber, userReference, senderName));
    });

    private final BiFunction<String, String, ParsedResult>  parseFunction;

    ExpressionParser(BiFunction<String, String, ParsedResult> parseFunction) {
        this.parseFunction = parseFunction;
    }

    public ParsedResult parse(String expression, String senderName) {
        return parseFunction.apply(expression, senderName);
    }

    private static String extractTicketNumber(String expression) {
        final Pattern TICKET_PATTERN = Pattern.compile("[a-zA-Z]{3}[0-9]{6}");

        Matcher ticketMatcher = TICKET_PATTERN.matcher(expression);
        if (ticketMatcher.find()) {
            return ticketMatcher.group();
        }
        return "";
    }

    private static String extractUserReference(String expression) {
        final Pattern USER_REF_PATTERN = Pattern.compile("<@[a-zA-Z0-9]{9}>");

        Matcher userRefMatcher = USER_REF_PATTERN.matcher(expression);
        if (userRefMatcher.find()) {
            return userRefMatcher.group().substring(2, 11);
        }
        return "";
    }
}
