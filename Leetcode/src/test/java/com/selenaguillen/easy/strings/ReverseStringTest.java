package com.selenaguillen.easy.strings;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.easy.strings.ReverseString.reverseString;
import static com.selenaguillen.easy.strings.ReverseString.reverseStringSB;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void testReverseStringSB() {
        String initial = "Cinna";
        String testReversed = "anniC";
        String actualReversed = reverseStringSB(initial);

        assertEquals(testReversed, actualReversed);
    }

    @Test
    void testReverseString() {
        String initial = "Cinna";
        String testReversed = "anniC";
        String actualReversed = reverseString(initial);

        assertEquals(testReversed, actualReversed);
    }

}