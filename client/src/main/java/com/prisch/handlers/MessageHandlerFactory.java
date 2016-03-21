package com.prisch.handlers;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.prisch.sbm.SBMService;

public class MessageHandlerFactory {

    private final SBMService sbmService;

    public MessageHandlerFactory(SBMService sbmService) {
        this.sbmService = sbmService;
    }

    public Message handle(Message request) {
        Message response;
        if (request instanceof TicketDetails.Request) {
            response = new TicketDetailsHandler(sbmService).process((TicketDetails.Request)request);
        } else {
            throw new IllegalStateException("Unknown message: " + request.getClass().getName());
        }

        response.setId(request.getId());
        return response;
    }

}
