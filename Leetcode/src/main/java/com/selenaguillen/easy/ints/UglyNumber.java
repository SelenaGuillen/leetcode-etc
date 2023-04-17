package com.selenaguillen.easy.ints;

public class UglyNumber {
    public boolean isUgly(int n) {
        if (n == 1) return true;
        else if (n % 3 == 0|| n % 2 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }
}
