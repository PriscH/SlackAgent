package com.prisch.factories;

import com.prisch.messages.TicketDetails;

public interface RequestFactory {

    static TicketDetails.Request buildTicketDetailsRequest(String ticketNumber) {
        TicketDetails.Request request = new TicketDetails.Request();
        request.setTicketNumber(ticketNumber);
        return request;
    }

    static TicketDetails.Request buildTicketDetailsWithNotesRequest(String ticketNumber) {
        TicketDetails.Request request = buildTicketDetailsRequest(ticketNumber);
        request.setNotesIncluded(true);
        return request;
    }
}
