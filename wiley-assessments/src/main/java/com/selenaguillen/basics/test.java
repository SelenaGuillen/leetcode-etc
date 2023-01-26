package com.selenaguillen.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        String str = "0830";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
    }
}
