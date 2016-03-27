package com.prisch.slack;

public interface SlackFormatter {

    static String bold(String message) {
        return String.format("*%s*", message);
    }

    static String escape(String message) {
        return message.replace("&", "&amp;")
                      .replace("<", "&lt;")
                      .replace(">", "&gt;");
    }
}
