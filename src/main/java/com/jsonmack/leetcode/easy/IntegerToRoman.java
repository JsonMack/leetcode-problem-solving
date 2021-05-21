package com.jsonmack.leetcode.easy;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Jason MacKeigan
 */
public class IntegerToRoman {

    private enum RomanNumeral {
        I(0, 1),
        V(1, 5),
        X(2, 10),
        L(3, 50),
        C(4, 100),
        D(5, 500),
        M(6, 1000);

        private static final Map<Integer, RomanNumeral> NUMERAL_BY_VALUE =
                Map.copyOf(EnumSet.allOf(RomanNumeral.class)
                        .stream()
                        .collect(Collectors.toMap(RomanNumeral::getValue, Function.identity())));

        private static final Map<Integer, RomanNumeral> NUMERAL_BY_ORDER =
                Map.copyOf(EnumSet.allOf(RomanNumeral.class)
                        .stream()
                        .collect(Collectors.toMap(RomanNumeral::getOrder, Function.identity())));

        private final int order;

        private final int value;

        RomanNumeral(int order, int value) {
            this.order = order;
            this.value = value;
        }

        private static RomanNumeral forValue(int value) {
            RomanNumeral numeral = NUMERAL_BY_VALUE.get(value);

            if (numeral == null) {
                throw new IllegalArgumentException("Roman numeral does not exist for value: " + value);
            }
            return numeral;
        }

        private static RomanNumeral offset(RomanNumeral numeral, int offset) {
            RomanNumeral offsetNumeral = NUMERAL_BY_ORDER.get(numeral.order + offset);

            if (offsetNumeral == null) {
                throw new IllegalArgumentException("Roman numeral does not exist for numeral at offset: [" + numeral + ", " + offset + "]");
            }
            return offsetNumeral;
        }

        public int getOrder() {
            return order;
        }

        public int getValue() {
            return value;
        }
    }

    public String integerToRoman(int number) {
        List<RomanNumeral> romanNumerals = new ArrayList<>();

        RomanNumeral romanNumeral = RomanNumeral.forValue(1000);

        while (number > 0) {
            int occurrences = number / romanNumeral.value;

            if (occurrences == 0) {
                romanNumeral = RomanNumeral.offset(romanNumeral, -2);
                continue;
            }
            int value = (occurrences * romanNumeral.value);

            if (occurrences == 9) {
                romanNumerals.add(romanNumeral);
                romanNumerals.add(RomanNumeral.offset(romanNumeral, 2));
            } else if (occurrences > 5 && occurrences < 9) {
                romanNumerals.add(RomanNumeral.offset(romanNumeral, 1));

                for (int i = 0; i < occurrences - 5; i++) {
                    romanNumerals.add(romanNumeral);
                }
            } else if (occurrences == 5) {
                romanNumerals.add(RomanNumeral.offset(romanNumeral, 1));
            } else if (occurrences == 4) {
                romanNumerals.add(romanNumeral);
                romanNumerals.add(RomanNumeral.offset(romanNumeral, 1));
            } else if (occurrences > 0) {
                for (int i = 0; i < occurrences; i++) {
                    romanNumerals.add(romanNumeral);
                }
            } else {
                throw new IllegalStateException("occurrance must be within 1 and 9 (inclusive): " + occurrences);
            }
            number -= value;

            if (number <= 0) {
                break;
            }
            romanNumeral = RomanNumeral.offset(romanNumeral, -2);
        }
        return romanNumerals.stream()
                .map(RomanNumeral::name)
                .collect(Collectors.joining());
    }
}
