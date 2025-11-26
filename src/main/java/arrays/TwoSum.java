package arrays;

import java.util.*;

public class TwoSum {

    private static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i=0; i < arr.length; i++) {
            int k = target - arr[i];
            if (freq.containsKey(k)) {
                return new int[]{i, freq.get(k)};
            }
            freq.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));  // Output: [0, 1]
    }
}
