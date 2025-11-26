package binarySearch.medium;

public class SearchInRotatedSortedArray {

    private static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (arr[mid] > target && target >= arr[left]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (arr[mid] < target && arr[right] >= target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int target1 = 0;
        int target2 = 3;

        System.out.println("Index of " + target1 + " → " + search(nums, target1)); // Expected: 4
        System.out.println("Index of " + target2 + " → " + search(nums, target2)); // Expected: -1
    }
}
