package com.jsonmack.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class SearchInsertPositionTest {

    @Test
    public void searchExpectedRightHalfExists() {
        Assertions.assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5, 6}, 5));
    }

    @Test
    public void searchExpectedLeftHalfInserted() {
        Assertions.assertEquals(1, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5, 6}, 2));
    }

    @Test
    public void searchExpectedGreaterThanRight() {
        Assertions.assertEquals(4, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

    @Test
    public void searchInsertAtIndexZero() {
        Assertions.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5, 6}, 0));
    }

    @Test
    public void searchInsertAtIndexZeroSizeOne() {
        Assertions.assertEquals(0, new SearchInsertPosition().searchInsert(new int[] {1}, 0));
    }

    @Test
    public void searchForOhNoWeGotAStackOverflow() {
        Assertions.assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5}, 5));
    }

    @Test
    public void searchForOhNoWeGotAStackOverflow2() {
        Assertions.assertEquals(2, new SearchInsertPosition().searchInsert(new int[] {1, 3, 5}, 4));
    }

    @Test
    public void searchExistsSizeTwo() {
        Assertions.assertEquals(1, new SearchInsertPosition().searchInsert(new int[] { 1, 3 }, 3));
    }

    @Test
    public void okWhat() {
        Assertions.assertEquals(3, new SearchInsertPosition().searchInsert(new int[] { 2, 7, 8, 9, 10 }, 9));
    }

}
