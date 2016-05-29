package com.prisch.parsers;

import com.prisch.factories.RequestFactory;
import com.prisch.responders.ChangelogResponder;
import com.prisch.responders.HelpResponder;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ExpressionParser {

    TICKET (expression -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    HELP (expression -> ParsedResult.with(new HelpResponder())),
    SHOW_CHANGELOG (expression -> ParsedResult.with(new ChangelogResponder())),

    SHOW_TICKET (expression -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    SHOW_TICKET_WITH_NOTES (expression -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsWithNotesRequest(ticketNumber));
    });

    private final Function<String, ParsedResult>  parseFunction;

    ExpressionParser(Function<String, ParsedResult> parseFunction) {
        this.parseFunction = parseFunction;
    }

    public ParsedResult parse(String expression) {
        return parseFunction.apply(expression);
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
        final Pattern USER_REF_PATTERN = Pattern.compile("<@[0-9]{9}>");

        Matcher userRefMatcher = USER_REF_PATTERN.matcher(expression);
        if (userRefMatcher.find()) {
            return userRefMatcher.group();
        }
        return "";
    }
}
