package com.jsonmack.leetcode.easy;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class SumOfUniqueElementsTest {

    @Test
    public void sumOfUniqueOof() {
        Assertions.assertEquals(25, new SumOfUniqueElements()
                .sumOfUnique(new int[] { 10, 6, 9, 6, 9, 6, 8, 7 }));
    }
}
