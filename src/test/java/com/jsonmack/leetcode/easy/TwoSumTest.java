package com.jsonmack.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jason MacKeigan
 */
public class TwoSumTest {

    @Test
    public void assertTargetExistsEvenSize() {
        Assertions.assertArrayEquals(new int[] {0, 1}, new TwoSum().twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }

    @Test
    public void assertTargetExistsOddSize() {
        Assertions.assertArrayEquals(new int[] {1, 2}, new TwoSum().twoSum(new int[] { 3, 2, 4 }, 6));
    }

    @Test
    public void assertTargetExistsDuplicates() {
        Assertions.assertArrayEquals(new int[] {0, 1}, new TwoSum().twoSum(new int[] { 3, 3 }, 6));
    }

}
