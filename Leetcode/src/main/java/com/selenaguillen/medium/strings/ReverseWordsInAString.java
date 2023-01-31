package com.selenaguillen.medium.strings;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));

    }
    public static String reverseWords(String s) {
        String[] asArray = s.split(" ");

        String result = "";
        for (int i = asArray.length - 1; i >= 0; i--) {
            if(asArray[i].length() != 0) {
                if (result.length() != 0) {
                    result+=(" ");
                }
                result+=asArray[i];
            }
        }
        return result;
    }
}
