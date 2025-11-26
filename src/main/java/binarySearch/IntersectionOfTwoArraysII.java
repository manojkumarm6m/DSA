package binarySearch;

import java.util.*;


public class IntersectionOfTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i: nums1){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for (int j : nums2){
            if (freq.containsKey(j) && freq.get(j) >0) {
                list.add(j);
                freq.put(j, freq.get(j) - 1);
            }
        }

        int index = 0;
        int[] nums = new int[list.size()];
        for (int i: list){
            nums[index++] = i;
        }
        return nums;

    }

        public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] result = intersect(nums1, nums2);

        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
