package arrays;

import java.util.Map;

public class MaximumSubarray {
    private static int maxSubArray(int[] arr) {
        int maximum = arr[0];
        int currentSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i] + currentSum, arr[i]);
            maximum = Math.max(currentSum, maximum);
        }
        return maximum;
    }


    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));  // Output: 6  (subarray [4, -1, 2, 1])
    }
}
