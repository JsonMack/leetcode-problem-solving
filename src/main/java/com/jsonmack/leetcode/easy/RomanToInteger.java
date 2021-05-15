package com.jsonmack.leetcode.easy;

import java.util.Map;

/**
 * @author Jason MacKeigan
 */
public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_CHARACTERS = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        char[] characters = s.toCharArray();

        int totalSum = 0;

        for(int i = 0; i < s.length(); i++) {
            int numericalValueAtIndex = ROMAN_CHARACTERS.get(characters[i]);

            if (i == s.length() - 1) {
                totalSum += numericalValueAtIndex;
                break;
            }
            int numericalValueAtNext = ROMAN_CHARACTERS.get(characters[i + 1]);

            if (numericalValueAtNext > numericalValueAtIndex) {
                int difference = numericalValueAtNext - numericalValueAtIndex;

                if (difference % 4 == 0 || difference % 9 == 0) {
                    totalSum += difference;
                    i++;
                    continue;
                }
            }
            totalSum += numericalValueAtIndex;
        }
        return totalSum;
    }
}
