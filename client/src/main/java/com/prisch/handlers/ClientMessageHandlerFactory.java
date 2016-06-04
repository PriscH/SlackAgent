package com.prisch.handlers;

import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.prisch.messages.TicketList;
import com.prisch.sbm.SBMService;

public class ClientMessageHandlerFactory {

    private final SBMService sbmService;

    public ClientMessageHandlerFactory(SBMService sbmService) {
        this.sbmService = sbmService;
    }

    public Message handle(Message request) {
        Message response;
        if (request instanceof TicketDetails.Request) {
            response = new TicketDetailsRequestHandler(sbmService).process((TicketDetails.Request) request);
        } else if (request instanceof TicketList.Request) {
            response = new TicketListRequestHandler(sbmService).process((TicketList.Request) request);
        } else {
            throw new IllegalStateException("Unknown message: " + request.getClass().getName());
        }

        response.setId(request.getId());
        return response;
    }

}
