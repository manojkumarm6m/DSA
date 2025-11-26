package arrays.medium;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixII {


    private static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
            }
            bottom--;

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] result = generateMatrix(n);

        System.out.println("Generated Spiral Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
