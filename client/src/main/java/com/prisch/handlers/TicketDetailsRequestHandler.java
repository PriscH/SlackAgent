package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketDetails;
import com.prisch.sbm.SBMService;
import com.prisch.sbm.stubs.FieldValue;
import com.prisch.sbm.stubs.NameValue;
import com.prisch.sbm.stubs.TTItem;
import com.prisch.util.Result;

import java.util.Optional;

public class TicketDetailsRequestHandler {

    private static final String ASSIGNEE_FIELD = "L3_PRIMARY_CONTACT_USER";

    private final SBMService sbmService;

    public TicketDetailsRequestHandler(SBMService sbmService) {
        this.sbmService = sbmService;
    }

    public Message process(TicketDetails.Request ticketDetailsRequest) {
        String ticketNumber = ticketDetailsRequest.getTicketNumber();
        Result<TTItem> itemResult = sbmService.getTicketDetails(ticketNumber);

        if (itemResult.isSuccess()) {
            TicketDetails.Response response = new TicketDetails.Response();

            response.setTicketNumber(itemResult.get().getId().getValue().getDisplayName().getValue());
            response.setType(itemResult.get().getItemType().getValue());
            response.setTitle(itemResult.get().getTitle().getValue());
            response.setDescription(itemResult.get().getDescription().getValue());
            response.setState(itemResult.get().getState().getValue().getDisplayName().getValue());
            response.setUrl(itemResult.get().getUrl().getValue());

            Optional<NameValue> assigneeField = itemResult.get().getExtendedField().stream()
                                                                                   .filter(field -> field.getId().getValue().getDbName().getValue().equals(ASSIGNEE_FIELD))
                                                                                   .findFirst();
            assigneeField.ifPresent(field ->
                field.getValue().stream().findFirst().ifPresent(value -> response.setAssignee(value.getDisplayValue().getValue()))
            );

            return response;
        } else {
            return new FailureResponse(itemResult.getMessage());
        }
    }
}
