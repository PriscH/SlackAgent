package com.prisch.messages;

public class FailureResponse extends Message {

    private final String message;

    public FailureResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
