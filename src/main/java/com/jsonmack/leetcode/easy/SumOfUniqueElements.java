package com.jsonmack.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Jason MacKeigan
 */
public class SumOfUniqueElements {


    public int sumOfUnique(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        Set<Integer> duplicates = new HashSet<>();

        for (int index = 0; index < nums.length / 2; index++) {
            int valueAtIndex = nums[index];

            int tailIndex = nums.length - index - 1;

            if (tailIndex == index) {
                addIfUnique(valueAtIndex, unique, duplicates);
                continue;
            }
            int valueAtTail = nums[tailIndex];

            if (valueAtTail == valueAtIndex) {
                duplicates.add(valueAtTail);
                continue;
            }
            addIfUnique(valueAtIndex, unique, duplicates);
            addIfUnique(valueAtTail, unique, duplicates);
        }
        return unique.stream()
                .mapToInt(i -> i)
                .sum();
    }

    private void addIfUnique(int value, Set<Integer> unique, Set<Integer> duplicate) {
        if (duplicate.contains(value)) {
            return;
        }
        if (unique.contains(value)) {
            unique.remove(value);
            duplicate.add(value);
            return;
        }
        unique.add(value);
    }

}
