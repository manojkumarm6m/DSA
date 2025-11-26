package trial;

import java.util.Arrays;

public class ShuffleTheArray {

    private static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            res[index++] = nums[i];
            res[index++] = nums[i + n];
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
