package com.prisch.parsers;

import com.prisch.messages.Message;
import com.prisch.responders.Responder;

import java.util.Optional;

public class ParsedResult {

    private final Optional<Responder> responder;
    private final Optional<Message> message;

    public static ParsedResult with(Responder responder) {
        return new ParsedResult(responder, null);
    }

    public static ParsedResult with(Message message) {
        return new ParsedResult(null, message);
    }

    public static ParsedResult empty() {
        return new ParsedResult(null, null);
    }

    protected ParsedResult(Responder responder, Message message) {
        this.responder = Optional.ofNullable(responder);
        this.message = Optional.ofNullable(message);
    }

    public boolean hasResponder() {
        return responder.isPresent();
    }

    public Responder getResponder() {
        return responder.get();
    }

    public boolean hasMessage() {
        return message.isPresent();
    }

    public Message getMessage() {
        return message.get();
    }
}
