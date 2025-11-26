package sorting;

import java.util.*;


public class ThreeSumClosest {


    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2]; // start with any 3-sum
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                // If this sum is closer to target, update it
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // move pointers
                if (sum < target) {
                    l++;      // need a bigger sum
                } else if (sum > target) {
                    r--;      // need a smaller sum
                } else {
                    return sum;  // exact match — can’t get closer
                }
            }
        }
        return closest;

    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target)); // Output: 2
    }
}
