package binarySearch.medium;

public class KokoEatingBananas1 {

    // Function to find minimum eating speed
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0;

        // find the max pile (since Koko can't eat faster than the largest pile)
        for (int p : piles) {
            right = Math.max(right, p);
        }

        // Binary search for minimum valid speed
        while (left < right) {
            int mid = left + (right - left) / 2; // possible speed
            int hours = 0;

            // calculate hours taken for this speed
            for (int p : piles) {
                hours += (p + mid - 1) / mid;  // same as ceil(p/mid)
            }

            // if it takes more hours → too slow
            if (hours > h)
                left = mid + 1;
            else
                right = mid; // maybe we can go slower
        }

        return left; // minimum valid speed
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed (k): " + result);
    }
}

