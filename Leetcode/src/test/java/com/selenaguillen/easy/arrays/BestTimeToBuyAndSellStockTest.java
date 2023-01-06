package com.selenaguillen.easy.arrays;

import org.junit.jupiter.api.Test;

import static com.selenaguillen.easy.arrays.BestTimeToBuyAndSellStock.maxProfit;
import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit1() {
        int[] prices = {7,1,5,3,6,4};
        int testMaxProfit = 5;
        int actualMaxProfit = maxProfit(prices);

        assertEquals(testMaxProfit, actualMaxProfit);
    }

    @Test
    void maxProfit2() {
        int[] prices = {7,6,4,3,1};
        int testMaxProfit = 0;
        int actualMaxProfit = maxProfit(prices);

        assertEquals(testMaxProfit, actualMaxProfit);
    }

}