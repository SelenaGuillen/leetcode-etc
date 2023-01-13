package com.selenaguillen.medium.arrays;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.medium.arrays.ProductOfArrayExceptSelf.productOfArrayExceptSelf;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productOfArrayExceptSelf1() {
        int[] nums = {1,2,3,4};
        int[] test = {24, 12, 8, 6};

        int[] actual = productOfArrayExceptSelf(nums);

        assertEquals(test.length, actual.length);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(test[i], actual[i]);
        }
    }

    @Test
    void productOfArrayExceptSelf2() {
        int[] nums = {-1,1,0,-3,3};
        int[] test = {0,0,9,0,0};

        int[] actual = productOfArrayExceptSelf(nums);

        assertEquals(test.length, actual.length);
        for (int i = 0; i < nums.length; i++) {
            assertEquals(test[i], actual[i]);
        }
    }
}