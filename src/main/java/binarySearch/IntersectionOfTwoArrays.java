package binarySearch;

import java.util.*;


public class IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int c : nums1) {
            set.add(c);
        }

        for (int i : nums2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        int[] res = new int[result.size()];
        int index = 0;
        for (int i : result) {
            res[index++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersection(nums1, nums2);

        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
