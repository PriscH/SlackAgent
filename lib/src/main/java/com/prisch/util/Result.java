package com.prisch.util;

import java.util.Optional;

public class Result<T> {

    private final Optional<T> value;
    private final Optional<String> message;

    private Result(Optional<T> value, Optional<String> message) {
        this.value = value;
        this.message = message;
    }

    public static <S> Result<S> success(S value) {
        return new Result<S>(Optional.of(value), Optional.<String>empty());
    }

    public static <S> Result<S> failure(String message) {
        return new Result<>(Optional.<S>empty(), Optional.of(message));
    }

    public boolean isSuccess() {
        return value.isPresent();
    }

    public T get() {
        return value.get();
    }

    public String getMessage() {
        return message.get();
    }
}
