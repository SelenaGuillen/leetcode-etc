package com.selenaguillen.basics;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.basics.PerfectSquare.isPerfectSquare;
import static org.junit.jupiter.api.Assertions.*;

class PerfectSquareTest {

    @Test
    void isPerfectSquare3456() {
        boolean test = false;
        boolean actual = isPerfectSquare(3456);
        assertEquals(test, actual);
    }

    @Test
    void isPerfectSquare625() {
        boolean test = true;
        boolean actual = isPerfectSquare(625);
        assertEquals(test, actual);
    }
}