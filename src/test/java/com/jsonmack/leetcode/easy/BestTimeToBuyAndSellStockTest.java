package com.jsonmack.leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class BestTimeToBuyAndSellStockTest {

    @Test
    public void maxProfitZeroMin() {
        Assertions.assertEquals(2, new BestTimeToBuyAndSellStock().maxProfit(new int[] { 2,1,2,1,0,1,2 }));
    }
}
