package com.prisch.messages;

public class NoContentMessage extends Message {

    public static final String IDENTIFIER = "com.prisch.messages.NO_CONTENT";

    public NoContentMessage() {
        super.setId(-1);
        super.setAction(IDENTIFIER);
    }
}
