package com.jsonmack.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason MacKeigan
 */
public class MatrixDiagonalSumTest {

    @Test
    public void assertSingle() {
        Assert.assertEquals(5, new MatrixDiagonalSum().diagonalSum(new int[][] {
                {5}
        }));
    }

    @Test
    public void assertEven() {
        Assert.assertEquals(8, new MatrixDiagonalSum().diagonalSum(new int[][]{
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        }));
    }

    @Test
    public void assertOdd() {
        Assert.assertEquals(25, new MatrixDiagonalSum().diagonalSum(new int[][] {
                { 1,2,3 } ,
                { 4,5,6 },
                { 7,8,9 }
        }));
    }

    @Test
    public void assertWhat() {
        int[][] matrix = {
                {7, 9, 8, 6, 3},
                {3, 9, 4, 5, 2},
                {8, 1, 10, 4, 10},
                {9, 5, 10, 9, 6},
                {7, 2, 4, 10, 8}
        };

        Assert.assertEquals(63, new MatrixDiagonalSum().diagonalSum(matrix));
    }

}
