package sorting;

import java.util.*;

public class MergeIntervals {

    private static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (curr[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], curr[1]);
            } else {
                result.add(prev);
                prev = curr;
            }
        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
