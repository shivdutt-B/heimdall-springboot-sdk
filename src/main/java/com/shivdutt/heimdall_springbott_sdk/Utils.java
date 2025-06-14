package com.shivdutt.heimdall;

import java.time.LocalDateTime;

public class Utils {

    public static String getFormattedTimestamp() {
        return LocalDateTime.now().toString();
    }

    public static void log(String message) {
        System.out.println("[Heimdall SDK] " + getFormattedTimestamp() + " - " + message);
    }
}
