package binarySearch.medium;
import java.util.*;

public class FindRightInterval {

    public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;

        // Step 1: Store each interval’s start value along with its original index
        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0]; // start value
            starts[i][1] = i;               // original index
        }

        // Step 2: Sort intervals by start value
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 3: Prepare result array
        int[] result = new int[n];

        // Step 4: For each interval, binary search the first start >= end
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int idx = binarySearch(starts, end);
            result[i] = (idx == -1) ? -1 : starts[idx][1];
        }

        return result;
    }

    // Step 5: Binary search helper – find the smallest start >= target
    private static int binarySearch(int[][] starts, int target) {
        int left = 0, right = starts.length - 1, ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (starts[mid][0] >= target) {
                ans = mid;
                right = mid - 1; // try to find a smaller start that still fits
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // Step 6: Main method to test
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
        // Output: [1, 2, -1]
    }
}
