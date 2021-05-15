package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class DefangingIpAddress {

    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

}
