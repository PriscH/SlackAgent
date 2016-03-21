package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.prisch.sbm.SBMService;
import com.prisch.sbm.stubs.TTItem;
import com.prisch.util.Result;

public class TicketDetailsHandler {

    private final SBMService sbmService;

    public TicketDetailsHandler(SBMService sbmService) {
        this.sbmService = sbmService;
    }

    public Message process(TicketDetails.Request ticketDetailsRequest) {
        String ticketNumber = ticketDetailsRequest.getTicketNumber();
        Result<TTItem> itemResult = sbmService.getTicketDetails(ticketNumber);

        if (itemResult.isSuccess()) {
            TicketDetails.Response response = new TicketDetails.Response();
            response.setSubject(itemResult.get().getTitle().getValue());
            return response;
        } else {
            return new FailureResponse(itemResult.getMessage());
        }
    }
}
