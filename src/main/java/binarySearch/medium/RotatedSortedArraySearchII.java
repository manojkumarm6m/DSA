package binarySearch.medium;

public class RotatedSortedArraySearchII {


    public static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return true;

            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,0,1,1,1};
        int target1 = 0;
        int target2 = 3;

        System.out.println(search(nums1, target1)); // true
        System.out.println(search(nums1, target2)); // false
    }
}
