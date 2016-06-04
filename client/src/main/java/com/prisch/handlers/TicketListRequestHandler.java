package com.prisch.handlers;

import com.prisch.messages.FailureResponse;
import com.prisch.messages.Message;
import com.prisch.messages.TicketList;
import com.prisch.sbm.SBMService;
import com.prisch.sbm.stubs.TTItem;
import com.prisch.sbm.stubs.TTItemList;
import com.prisch.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class TicketListRequestHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(TicketListRequestHandler.class);
    private static final String UNABLE_FIND_USER = "Sorry, I'm unable to find your SBM user.";

    private final SBMService sbmService;

    public TicketListRequestHandler(SBMService sbmService) {
        this.sbmService = sbmService;
    }

    public Message process(TicketList.Request ticketListRequest) {
        long sbmUserId;
        try {
            Properties userMappings = loadUserMappings();
            if (!userMappings.containsKey(ticketListRequest.getUsername())) {
                return new FailureResponse(UNABLE_FIND_USER);
            }
            sbmUserId = Long.parseLong(userMappings.getProperty(ticketListRequest.getUsername()));
        } catch (IOException ex) {
            LOGGER.error("Unable to load the Slack to SBM user mappings.", ex);
            return new FailureResponse(UNABLE_FIND_USER);
        }

        Result<TTItemList> itemsResult = sbmService.getTicketsFor(sbmUserId);

        if (itemsResult.isSuccess()) {
            List<TicketList.Ticket> tickets = itemsResult.get().getItem().stream().map(this::convertTicket).collect(Collectors.toList());

            TicketList.Response response = new TicketList.Response();
            response.setTickets(tickets);

            return response;
        } else {
            return new FailureResponse(itemsResult.getMessage());
        }
    }

    private Properties loadUserMappings() throws IOException {
        Properties properties = new Properties();
        try (final InputStream propertyStream = TicketListRequestHandler.class.getResourceAsStream("/users.properties")) {
            properties.load(propertyStream);
        }
        return properties;
    }

    private TicketList.Ticket convertTicket(TTItem ttItem) {
        TicketList.Ticket ticket = new TicketList.Ticket();

        ticket.setTicketNumber(ttItem.getId().getValue().getDisplayName().getValue());
        ticket.setTitle(ttItem.getTitle().getValue());
        ticket.setState(ttItem.getState().getValue().getDisplayName().getValue());

        return ticket;
    }
}
