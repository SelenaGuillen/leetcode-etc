package com.selenaguillen.medium.arrays;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (currentSum < 0) {
                currentSum = nums[i];
                maxSum = Math.max(currentSum, maxSum);

            }
            else {
              if (i > 0) {
                  currentSum+=nums[i];
                  maxSum = Math.max(currentSum, maxSum);
              }
            }
        }
        return maxSum;
    }
}
