/*
Write a program to find the solution of a series 1! + 2! + 3!..+ N!
Input: number (N)
Output: Print the sum of the given series

Sample: Input 1: 5  Output 1: 153
 */

package com.selenaguillen.basics;

public class SumOfFactorials {

    public static int findFactorial(int N) {
        int factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int findFactorialSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += findFactorial(i);
        }

        return sum;
    }
}
