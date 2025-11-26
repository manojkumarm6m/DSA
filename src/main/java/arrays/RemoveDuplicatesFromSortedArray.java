package arrays;


import java.util.*;

public class RemoveDuplicatesFromSortedArray {


    private static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i=1; i< nums.length; i++){
            if (nums[i] != nums[i - 1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }


    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + len);
        System.out.print("Modified array: ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));
    }
}
