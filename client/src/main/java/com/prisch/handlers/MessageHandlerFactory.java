package com.prisch.handlers;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;

public interface MessageHandlerFactory {

    static Message handle(Message request) {
        Message response;
        if (request instanceof TicketDetails.Request) {
            response = new TicketDetailsHandler().process((TicketDetails.Request)request);
        } else {
            throw new IllegalStateException("Unknown message: " + request.getClass().getName());
        }

        response.setId(request.getId());
        return response;
    }

}
