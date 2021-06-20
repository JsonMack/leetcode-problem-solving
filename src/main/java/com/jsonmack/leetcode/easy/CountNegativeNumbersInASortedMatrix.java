package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class CountNegativeNumbersInASortedMatrix {

    public int countNegatives(int[][] grid) {
        int sum = 0;

        for (int[] elements : grid) {
            int indexOfFirst = findIndexOfFirstNegative(elements);

            if (indexOfFirst == -1) {
                continue;
            }
            sum += elements.length - indexOfFirst;
        }
        return sum;
    }

    private int findIndexOfFirstNegative(int[] elements) {
        if (elements[0] < 0) {
            return 0;
        }
        return findIndexOfFirstNegative(elements, 0, elements.length);
    }

    private int findIndexOfFirstNegative(int[] row, int left, int right) {
        if (left == right) {
            return -1;
        }
        int pointer = Math.min(row.length - 1, left + (right / 2));

        int elementAtPointer = row[pointer];

        if (elementAtPointer >= 0) {
           if (pointer == row.length - 1) {
               return -1;
           }
           return findIndexOfFirstNegative(row, left + Math.max(1, (pointer / 2)), right);
        }
        if (pointer == 0) {
            return pointer;
        }
        int leftOfElement = row[pointer - 1];

        if (leftOfElement >= 0) {
            return pointer;
        }
        return findIndexOfFirstNegative(row, left, right - Math.max(1, (pointer / 2)));
    }

}
