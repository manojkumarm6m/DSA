package binarySearch;


import java.util.*;

public class SpecialArray {

    public static int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x + 1];

        // Count frequency of elements (cap values >= n into last bucket)
        for (int elem : nums) {
            if (elem >= x)
                counts[x]++;
            else
                counts[elem]++;
        }

        int res = 0;
        // Go backward to accumulate number of elements >= i
        for (int i = counts.length - 1; i > 0; i--) {
            res += counts[i];
            if (res == i)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 5};
        int[] nums2 = {0, 0};
        int[] nums3 = {0, 4, 3, 0, 4};
        int[] nums4 = {1, 2, 3, 4, 5, 6};

        System.out.println("Result 1: " + specialArray(nums1)); // 2
        System.out.println("Result 2: " + specialArray(nums2)); // -1
        System.out.println("Result 3: " + specialArray(nums3)); // 3
        System.out.println("Result 4: " + specialArray(nums4)); // 3
    }
}
