package com.prisch.handlers;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;

public class TicketDetailsHandler {

    public Message process(TicketDetails.Request ticketDetailsRequest) {
        TicketDetails.Response response = new TicketDetails.Response();
        response.setSubject("Success");
        return response;
    }
}
