package com.prisch.messages;

public interface MessageMapping {

    static boolean hasNoContent(String input) {
        return input.contains(NoContentMessage.IDENTIFIER);
    }

    static Class<? extends Message> requestMappingFor(String input) {
        if (input.contains(TicketDetails.class.getName())) {
            return TicketDetails.Request.class;
        }

        return null;
    }

    static Class<? extends Message> responseMappingFor(String input) {
        if (input.contains(TicketDetails.class.getName())) {
            return TicketDetails.Response.class;
        }

        return null;
    }
}
