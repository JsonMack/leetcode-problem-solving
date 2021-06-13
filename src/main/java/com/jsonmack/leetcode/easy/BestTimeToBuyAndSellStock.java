package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;

        int maxProfit = 0;

        for (int index = 0; index < prices.length; index++) {
            int valueAtIndex = prices[index];

            if (valueAtIndex < min) {
                min = valueAtIndex;
                continue;
            }
            int difference = valueAtIndex - min;

            if (difference > maxProfit) {
                maxProfit = difference;
            }
        }
        return maxProfit;
    }

}
