package com.selenaguillen.medium.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String string = "pwwkew";
        lengthOfLongestSubstring(string);
    }

    protected static int lengthOfLongestSubstring(String s) {

        int[] chars = new int[128];

        int left = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }

            res = Math.max(res, right - left + 1);

            right++;
        }
        System.out.println(res);
        return res;
    }

}
