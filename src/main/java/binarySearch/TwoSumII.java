package binarySearch;

public class TwoSumII {

    private static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{left+1, right+1};
            else if (sum < target) {
                left += 1;
            } else {
                right -=1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(numbers, target);
        System.out.println("Indices: " + res[0] + ", " + res[1]); // Output: 1, 2
    }
}
