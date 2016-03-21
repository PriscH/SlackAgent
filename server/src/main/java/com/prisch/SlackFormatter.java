package com.prisch;

import com.prisch.messages.TicketDetails;

public interface SlackFormatter {

    static String formatTicketDetails(TicketDetails.Response response) {
        return "";
    }

}
