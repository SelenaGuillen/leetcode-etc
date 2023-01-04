/*
Write a program to check if a number is a perfect square.
 */

package com.selenaguillen.basics;

public class PerfectSquare {
    public static boolean isPerfectSquare(int N) {
        double squareRoot = Math.sqrt(N);
        return squareRoot - Math.floor(squareRoot) == 0;
    }
}
