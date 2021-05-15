package com.jsonmack.leetcode.easy;

/**
 * 1. create a new array that is the same size as input
 * 2. store value at index 0 in new array
 * 3. loop through each index of array
 * 4. for each index, store value at index equal to the
 *      value at this index + the value at previous index
 * 5. keep track of current value or use value at previous
 *      index in the new array.
 * @author Jason MacKeigan
 */
public class RunningSumOfArray {

    public int[] runningSum(int[] nums) {
        if (nums.length <= 1) {
            throw new IllegalArgumentException(
                    "Length must be 2 or greater.");
        }
        int[] result = new int[nums.length];

        result[0] = nums[0];

        for (int index = 1; index < result.length; index++) {
            result[index] = result[index - 1] + nums[index];
        }
        return result;
    }

}
