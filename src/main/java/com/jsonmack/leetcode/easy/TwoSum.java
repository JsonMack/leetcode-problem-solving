package com.jsonmack.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jason MacKeigan
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int valueAtIndex = nums[index];

            Integer indexOfDifference = values.get(target - valueAtIndex);

            if (indexOfDifference != null) {
                return new int[] { indexOfDifference, index };
            }
            values.put(valueAtIndex, index);
        }
        throw new IllegalStateException("No two sums in the array equal the target.");
    }
}
