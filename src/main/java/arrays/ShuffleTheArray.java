package arrays;

import java.util.Arrays;

public class ShuffleTheArray {

    private static int[] shuffle(int[] nums, int n) {
        int indexes = 0;
        int[] res = new int[nums.length];
        for (int i = 0; i < n; i+=2) {
            res[i] = nums[indexes++];
            res[i+1] = nums[n++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Shuffled: " + Arrays.toString(result));
    }
}
