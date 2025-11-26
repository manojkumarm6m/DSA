package arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = nums[0];

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] + nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}

