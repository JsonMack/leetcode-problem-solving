package com.jsonmack.leetcode.easy;

/**
 * @author Jason MacKeigan
 */
public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {
                { 1,2,3 } ,
                { 4,5,6 },
                { 7,8,9 }
        };

        System.out.println(new MatrixDiagonalSum().diagonalSum(mat));
    }

    //n == mat.length == mat[i].length
    //1 <= n <= 100
    //1 <= mat[i][j] <= 100
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int index = 0;

        int rows = mat.length;

        int columns = mat[0].length;

        if (rows == 1) {
            return mat[rows / 2][columns / 2];
        }
        boolean even = rows % 2 == 0;

        int middle = rows / 2;

        do {
            int topLeft = mat[index][index];

            int topRight = mat[index][columns - 1 - index];

            int bottomLeft = mat[rows - 1 - index][index];

            int bottomRight = mat[rows - 1 - index][columns - 1 - index];

            sum += topLeft + topRight + bottomLeft + bottomRight;
        } while (++index < middle);

        if (even) {
            return sum;
        }
        return sum + mat[rows / 2][columns / 2];
    }

}
