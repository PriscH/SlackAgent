package com.prisch.messages;

public abstract class Message {

    private int id;
    private String action;

    protected Message() {
        this.action = this.getClass().getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }
}
