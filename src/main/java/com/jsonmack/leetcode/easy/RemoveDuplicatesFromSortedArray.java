package com.jsonmack.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * @author Jason MacKeigan
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int duplicates = 0;

        for (int i = 0; i < nums.length - 1;) {
            if (nums[i] == nums[i+1]) {
                duplicates++;

                for (int j = i + 1; j < nums.length - 1; j++) {
                    int leftTemp = nums[j];

                    if (nums[j + 1] < leftTemp) {
                        break;
                    }
                    nums[j] = nums[j + 1];
                    nums[j + 1] = leftTemp;
                }
            }
            if (i >= nums.length - 1 - duplicates) {
                break;
            }

            if (nums[i] != nums[i + 1]) {
                i++;
            }
        }
        return nums.length - duplicates;
    }
}
