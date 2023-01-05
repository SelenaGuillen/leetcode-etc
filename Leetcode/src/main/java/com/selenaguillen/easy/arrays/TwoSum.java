/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

package com.selenaguillen.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int[] answer = findTwoSumHM(array, 9);

        int[] array2 = {3, 2, 4};
        int[] answer2 = findTwoSumHM(array2, 6);

        for(int a: answer) {
            System.out.println(a);
        }

        for (int a: answer2) {
            System.out.println(a);
        }

    }

    //brute force
    public static int[] findTwoSum(int[] nums, int target) {
        int[] answer = new int[2];
        if (nums.length < 2) {
            throw new UnsupportedOperationException("Array not long enough");
        }

        //O(n)^2
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == target - nums[i] && i != j) {
                    answer[0] = j;
                    answer[1] = i;
                }
            }
        }
        return answer;
    }

    public static int[] findTwoSumHM(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        //hm will be value: index
        int[] answer = new int[2];


        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                answer[0] = hm.get(target - nums[i]); //gets the index of key in hm
                answer[1] = i;
                break;
            }
            hm.put(nums[i], i);
        }

        return answer;

    }
}
