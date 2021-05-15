package com.jsonmack.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        Assert.assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
        Assert.assertEquals(14, new RomanToInteger().romanToInt("XIV"));
        Assert.assertEquals(29, new RomanToInteger().romanToInt("XXIX"));
        Assert.assertEquals(432, new RomanToInteger().romanToInt("CDXXXII"));
    }
}
