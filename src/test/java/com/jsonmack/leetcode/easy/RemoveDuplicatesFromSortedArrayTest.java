package com.jsonmack.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.stream.IntStream;

/**
 * @author Jason MacKeigan
 */
@RunWith(JUnit4.class)
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int[] input = { 0,0,1,1,1,2,2,3,3,4 };

        int[] expected = { 0,1,2,3,4 };

        int length = new RemoveDuplicatesFromSortedArray().removeDuplicates(input);

        Assert.assertEquals(5, length);
        Assert.assertEquals(IntStream.of(expected).sum(), IntStream.of(input).limit(5).sum());
    }

}


