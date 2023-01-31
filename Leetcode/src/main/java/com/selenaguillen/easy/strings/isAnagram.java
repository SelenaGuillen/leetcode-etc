package com.selenaguillen.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
    //TODO: find a cleaner way to write this
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        Map<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            if (hm2.containsKey(t.charAt(i))) {
                hm2.put(t.charAt(i), hm2.get(t.charAt(i)) + 1);
            } else {
                hm2.put(t.charAt(i), 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!hm.get(s.charAt(i)).equals(hm2.get(s.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
