package com.selenaguillen.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        singleNumber(nums);
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        int result = 0;

        for(Integer num: nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            }
            else {
                hm.put(num, 1);
            }
        }

        for(Integer num: nums) {
            if(hm.get(num) % 2 != 0) {
                result = num;
            }
        }
        return result;
    }
}
