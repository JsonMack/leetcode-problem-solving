package com.jsonmack.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jason MacKeigan
 */
public class DefangingIpAddressTest {

    @Test
    public void defangIPaddr() {
        assertEquals("255[.]100[.]50[.]0",
                new DefangingIpAddress().defangIPaddr("255.100.50.0"));
    }

}
