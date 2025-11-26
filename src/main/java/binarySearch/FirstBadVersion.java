package binarySearch;

public class FirstBadVersion {

    private static int bad;

    private static boolean isBadVersion(int version) {
        return version >= bad;
    }

    private static int firstBadVersion(int num) {
        int left = 1, right = num;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid + 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int n = 5;
        bad = 4; // suppose version 4 is the first bad one
        System.out.println("First bad version: " + firstBadVersion(n)); // Output: 4
    }
}
