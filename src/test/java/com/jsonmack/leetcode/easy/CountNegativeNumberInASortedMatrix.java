package com.jsonmack.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Jason MacKeigan
 */
public class CountNegativeNumberInASortedMatrix {

    @Test
    public void assertGreaterThanZero() {
        Assertions.assertEquals(8, countNegatives(new int[][] {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        }));
    }

    @Test
    public void assertZero() {
        Assertions.assertEquals(0, countNegatives(new int[][] { {3, 2}, {1, 0}}));
    }

    @Test
    public void assertSingleArrayGreaterThanZero() {
        Assertions.assertEquals(1, countNegatives(new int[][] {{-1}}));
    }

    @Test
    public void assertEvenElementsGreaterThanZero() {
        Assertions.assertEquals(3, countNegatives(new int[][] {
                { 1, -1 },
                { -1, -1 }
        }));
    }

    @Test
    public void assertOddElementsGreaterThanZero() {
        Assertions.assertEquals(16, countNegatives(new int[][] {
                { 3,-1,-3,-3,-3 },
                { 2,-2,-3,-3,-3 },
                { 1,-2,-3,-3,-3 },
                { 0,-3,-3,-3,-3 }
        }));
    }

    @Test
    public void assertIdk() {
        Assertions.assertEquals(40, countNegatives(new int[][]{
                {10, 10, 6, 5, 4, 4, 3, 3},
                {10, 9, 5, 4, 4, 3, 2, 1},
                {-2, -2, -2, -5, -5, -5, -5, -5},
                {-3, -3, -4, -5, -5, -5, -5, -5},
                {-3, -3, -4, -5, -5, -5, -5, -5},
                {-4, -5, -5, -5, -5, -5, -5, -5},
                {-5, -5, -5, -5, -5, -5, -5, -5}
        }));

    }

    private int countNegatives(int[][] grid) {
        return new CountNegativeNumbersInASortedMatrix().countNegatives(grid);
    }

}
