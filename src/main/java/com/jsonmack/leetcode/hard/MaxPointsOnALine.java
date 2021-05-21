package com.jsonmack.leetcode.hard;

import java.util.*;

/**
 * @author Jason MacKeigan
 */
public class MaxPointsOnALine {

    public static void main(String[] args) {
        int max = maxPoints(new int[][] {
                {1,1},
                {3,2},
                {5,3},
                {4,1},
                {1,4},
                {2,3}
        });
        System.out.println(max);
    }

    public static int maxPoints(int[][] input) {
        Set<Point> points = new HashSet<>();

        for (int[] ints : input) {
            points.add(new Point(ints[0], ints[1]));
        }
        System.out.println(points);

        return 0;
    }

    private static class Point {

        private final int x;

        private final int y;

        private final int hashCode;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.hashCode = Objects.hash(x, y);
        }

        @Override
        public int hashCode() {
            return hashCode;
        }

        @Override
        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (other instanceof Point) {
                Point otherPoint = (Point) other;

                return otherPoint.x == x && otherPoint.y == y;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    ", hashCode=" + hashCode +
                    '}';
        }
    }

}
