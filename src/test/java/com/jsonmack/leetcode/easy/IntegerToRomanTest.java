package com.jsonmack.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason MacKeigan
 */
public class IntegerToRomanTest {

    @Test
    public void integerToRoman() {
        Assert.assertEquals("I", new IntegerToRoman().integerToRoman(1));
        Assert.assertEquals("III", new IntegerToRoman().integerToRoman(3));
        Assert.assertEquals("IV", new IntegerToRoman().integerToRoman(4));
        Assert.assertEquals("IX", new IntegerToRoman().integerToRoman(9));
        Assert.assertEquals("LVIII", new IntegerToRoman().integerToRoman(58));
        Assert.assertEquals("MCMXCIV", new IntegerToRoman().integerToRoman(1994));
        Assert.assertEquals("MMMCMXCIX", new IntegerToRoman().integerToRoman(3999));
    }
}
