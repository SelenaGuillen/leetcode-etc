/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

package com.selenaguillen.easy.arrays;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] test = {1,2,3,1};
        containsDuplicate(test);
    }
    public static boolean containsDuplicateSet(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = true;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int number: nums) {
            if (hm.containsKey(number)) {
                hm.replace(number, hm.get(number), hm.get(number) + 1);
            }
            else {
                hm.put(number, 1);
            }
        }

        List<Integer> occurences= new ArrayList<>(hm.values());
        for (int o: occurences ) {
            if (o > 1) {
                containsDuplicate = true;
                break;
            }
            else containsDuplicate = false;
        }
        return containsDuplicate;
    }
}
