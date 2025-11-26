package arrays;

import java.util.Arrays;

public class Practice {


    private static int getConcatenation(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int[] arr : nums) {
            int cur = 0;
            for (int i : arr) {
                cur += i;
            }
            if (cur >= max) {
                max = cur;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4},
                {3, 6, 5, 9}};
        int res = getConcatenation(nums);
        System.out.println("Output: " + res);
    }
}
