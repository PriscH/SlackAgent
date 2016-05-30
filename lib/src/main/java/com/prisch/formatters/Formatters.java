package com.prisch.formatters;

import java.time.format.DateTimeFormatter;

public interface Formatters {

    DateTimeFormatter DATE_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    static String capitalize(String input) {
        return Character.toUpperCase(input.charAt(0)) + input.substring(1);
    }
}
