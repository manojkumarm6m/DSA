package arrays.medium;

import java.util.Arrays;

public class SetMatrixZeroes {


    private static int[][] setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[0][i] == 0 || matrix[j][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (firstRow) {
                matrix[0][i] = 0;
            }
        }

        for (int i = 0; i < row; i++) {
            if (firstCol) {
                matrix[i][0] = 0;
            }
        }

        return matrix;

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Before:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nAfter:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
