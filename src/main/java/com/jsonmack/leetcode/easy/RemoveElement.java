package com.jsonmack.leetcode.easy;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author Jason MacKeigan
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        List<Integer> indexOfOccurrences = new ArrayList<>(nums.length);

        for (int index = nums.length - 1; index > -1; index--) {
            int valueAtIndex = nums[index];

            if (valueAtIndex == val) {
                indexOfOccurrences.add(index);
            }
        }
        int tailLength = nums.length - 1;

        for (int indexOfOccurrence : indexOfOccurrences) { // advanced for-loop
            if (indexOfOccurrence == tailLength) {
                tailLength--;
                continue;
            }
            nums[indexOfOccurrence] = nums[tailLength];
            nums[tailLength] = val;
            tailLength--;
        }
        return nums.length - indexOfOccurrences.size();
    }
}
