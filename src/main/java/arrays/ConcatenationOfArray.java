package arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}

