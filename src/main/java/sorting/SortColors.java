package sorting;

import java.util.Arrays;

public class SortColors {


    private static void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            }
        }

    }


    public static void main(String[] args) {
        int[] nums = {2, 0, 1};

        sortColors(nums);

        System.out.println("Sorted Colors: " + Arrays.toString(nums));
    }
}
