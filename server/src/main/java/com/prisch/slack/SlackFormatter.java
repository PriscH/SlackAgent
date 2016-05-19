package com.prisch.slack;

public interface SlackFormatter {

    static String bold(String message) {
        return String.format("*%s*", message);
    }

    static String italics(String message) {
        return String.format("_%s_", message);
    }

    static String inline(String message) {
        return String.format("`%s`", message);
    }

    static String block(String message) {
        return String.format("```%s```", message);
    }

    static String escape(String message) {
        return message.replace("&", "&amp;")
                      .replace("<", "&lt;")
                      .replace(">", "&gt;");
    }

    static String newline() {
        return "\n";
    }
}
