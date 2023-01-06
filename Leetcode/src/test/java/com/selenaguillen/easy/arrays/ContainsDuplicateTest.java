package com.selenaguillen.easy.arrays;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.easy.arrays.ContainsDuplicate.containsDuplicate;
import static com.selenaguillen.easy.arrays.ContainsDuplicate.containsDuplicateSet;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate1() {
        int[] nums = {1,2,3,1};
        boolean test = true;
        boolean actual = containsDuplicate(nums);
        assertEquals(test, actual);
    }

    @Test
    void containsDuplicate2() {
        int[] nums = {1,2,3,4};
        boolean test = false;
        boolean actual = containsDuplicate(nums);
        assertEquals(test, actual);
    }

    @Test
    void containsDuplicate3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean test = true;
        boolean actual = containsDuplicate(nums);
        assertEquals(test, actual);
    }

    @Test
    void containsDuplicateSet1() {
        int[] nums = {1,2,3,1};
        boolean test = true;
        boolean actual = containsDuplicateSet(nums);
        assertEquals(test, actual);
    }

    @Test
    void containsDuplicateSet2() {
        int[] nums = {1,2,3,4};
        boolean test = false;
        boolean actual = containsDuplicateSet(nums);
        assertEquals(test, actual);
    }

    @Test
    void containsDuplicateSet3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        boolean test = true;
        boolean actual = containsDuplicateSet(nums);
        assertEquals(test, actual);
    }
}