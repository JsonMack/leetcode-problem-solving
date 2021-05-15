package com.jsonmack.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jason MacKeigan
 *
 * 1. Create a new boolean array that is the same size as the candies array
 * 2. If the amount at index + extra >= max ? true : false
 * 3. Problems;
 *      We dont know max when we first iterate
 *      Its not sorted
 *
 *
 */
public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];

        for (int index = 1; index <= candies.length / 2; index++) {
            int valueAtHead = candies[index];

            int valueAtTail = candies[candies.length - index];

            max = Math.max(max, Math.max(valueAtHead, valueAtTail));
        }
        List<Boolean> result = new ArrayList<>(candies.length);

        for (int index = 0; index < candies.length; index++) {
            result.set(index, candies[index] + extraCandies >= max);
        }
        return result;
    }

}
