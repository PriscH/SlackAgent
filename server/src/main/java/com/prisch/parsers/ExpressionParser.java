package com.prisch.parsers;

import com.prisch.factories.RequestFactory;
import com.prisch.responders.ChangelogResponder;
import com.prisch.responders.HelpResponder;
import com.prisch.slack.SlackMessage;

import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ExpressionParser {

    TICKET_REF ((expression, slackMessage) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    HELP ((expression, slackMessage) -> ParsedResult.with(new HelpResponder())),
    SHOW_CHANGELOG ((expression, slackMessage) -> ParsedResult.with(new ChangelogResponder())),

    SHOW_TICKET ((expression, slackMessage) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsRequest(ticketNumber));
    }),

    SHOW_TICKET_WITH_NOTES ((expression, slackMessage) -> {
        String ticketNumber = extractTicketNumber(expression);
        return ParsedResult.with(RequestFactory.buildTicketDetailsWithNotesRequest(ticketNumber));
    }),

    SHARE_TICKET ((expression, slackMessage) -> {
        String ticketNumber = extractTicketNumber(expression);
        String userReference = extractUserReference(expression);

        return ParsedResult.with(RequestFactory.buildTicketDetailsForSharingRequest(ticketNumber, userReference, slackMessage.getSenderRealName()));
    }),

    MY_TICKETS ((expression, slackMessage) -> ParsedResult.with(RequestFactory.buildMyTicketList(slackMessage.getSenderUsername())));

    private final BiFunction<String, SlackMessage, ParsedResult>  parseFunction;

    ExpressionParser(BiFunction<String, SlackMessage, ParsedResult> parseFunction) {
        this.parseFunction = parseFunction;
    }

    public ParsedResult parse(String expression, SlackMessage slackMessage) {
        return parseFunction.apply(expression, slackMessage);
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
