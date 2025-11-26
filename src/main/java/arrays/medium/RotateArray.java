package arrays.medium;

import java.util.Arrays;

public class RotateArray {

    private static void reverese(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }


    private static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverese(nums, 0, n - 1);
        reverese(nums, 0, k - 1);
        reverese(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);
        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }
}
