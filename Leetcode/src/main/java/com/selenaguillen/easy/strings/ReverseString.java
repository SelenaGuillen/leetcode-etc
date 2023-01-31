package com.selenaguillen.easy.strings;

public class ReverseString {

    //usual way
    public static String reverseStringSB(String initialString) {
        StringBuilder sb = new StringBuilder(initialString);
        return sb.reverse().toString();
    }

    public static String reverseString(String initialString) {
        String reversedString = "";

        for(int i = initialString.length() - 1; i >= 0; i--) {
            reversedString += initialString.charAt(i);
        }
        return reversedString;
    }
}
