package com.selenaguillen.medium.arrays;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.medium.arrays.MaximumSubarray.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray1() {
        int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expectedOutput = 6;

        int actualOutput = maxSubArray(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void maxSubArray2() {
        int[] input = {1};
        int expectedOutput = 1;

        int actualOutput = maxSubArray(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void maxSubArray3() {
        int[] input = {5,4,-1,7,8};
        int expectedOutput = 23;

        int actualOutput = maxSubArray(input);
        assertEquals(expectedOutput, actualOutput);
    }
}