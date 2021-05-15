package com.jsonmack.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class RunningSumOfArrayTest {


    @Test
    public void runningSum() {
        int[] result = new RunningSumOfArray()
                .runningSum(new int[] { 1, 2, 3, 4 });

        assertArrayEquals(new int[] { 1, 3, 6, 10}, result);
    }
}
