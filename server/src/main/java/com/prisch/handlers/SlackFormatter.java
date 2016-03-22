package com.prisch.handlers;

import com.prisch.messages.TicketDetails;

public interface SlackFormatter {

    static String formatTicketDetails(TicketDetails.Response response) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("%s (%s)\n", bold(escape(response.getTitle())), response.getState()));
        stringBuilder.append(String.format("```%s```\n", escape(response.getDescription())));
        stringBuilder.append(String.format("`%s`", escape(response.getUrl())));

        return stringBuilder.toString();
    }

    static String bold(String message) {
        return String.format("*%s*", message);
    }

    static String escape(String message) {
        return message.replace("&", "&amp;")
                      .replace("<", "&lt;")
                      .replace(">", "&gt;");
    }
}
