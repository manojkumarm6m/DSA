package binarySearch.medium;

public class FindFirstAndLastPosition {

    private static int secondNum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }


    private static int firstNum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return ans;
    }


    private static int[] searchRange(int[] arr, int target) {
        int first = firstNum(arr, target);
        int second = secondNum(arr, target);
        return new int[]{first, second};
    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
