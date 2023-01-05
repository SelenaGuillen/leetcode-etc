package com.selenaguillen.easy.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.selenaguillen.easy.arrays.TwoSum.findTwoSum;
import static com.selenaguillen.easy.arrays.TwoSum.findTwoSumHM;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void findTwoSum1() {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] testOutput = {0,1};

        int[] actualOutput = findTwoSum(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }

    @Test
    void findTwoSum2() {
        int[] array = {3,2,4};
        int target = 6;
        int[] testOutput = {1,2};

        int[] actualOutput = findTwoSum(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }

    @Test
    void findTwoSum3() {
        int[] array = {3,3};
        int target = 6;
        int[] testOutput = {0,1};

        int[] actualOutput = findTwoSum(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }

    @Test
    void findTwoSumHM1() {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] testOutput = {0,1};

        int[] actualOutput = findTwoSumHM(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }

    @Test
    void findTwoSumHM2() {
        int[] array = {3,2,4};
        int target = 6;
        int[] testOutput = {1,2};

        int[] actualOutput = findTwoSumHM(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }

    @Test
    void findTwoSumHM3() {
        int[] array = {3,3};
        int target = 6;
        int[] testOutput = {0,1};

        int[] actualOutput = findTwoSumHM(array, target);

        for(int i = 0; i < 2; i++) {
            assertEquals(testOutput[i], actualOutput[i]);
        }
    }
}