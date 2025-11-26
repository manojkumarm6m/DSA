package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersMatrix {
    static int minimum;
    static int maximum;


    private static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int[] min = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            minimum = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minimum) minimum = matrix[i][j];
            }
            min[i] = minimum;
        }
        int[] max = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            maximum = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[j][i] > maximum) maximum = matrix[j][i];
            }
            max[i] = maximum;
        }

        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(max));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == min[i] && matrix[i][j] == max[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;

    }


    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        System.out.println(luckyNumbers(matrix));  // Output: [15]
    }
}
