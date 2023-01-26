package com.selenaguillen.easy.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberlll {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
        singleNumber(nums);
    }
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();

        int[] result = new int[2];
        List<Integer> list = new ArrayList<>();

        for(Integer num: nums) {
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            }
            else {
                hm.put(num, 1);
            }
        }

        for(Integer num: nums) {
            if (hm.get(num) == 1) {
                list.add(num);
            }
        }


        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}


