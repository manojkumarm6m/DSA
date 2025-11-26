package binarySearch.medium;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h)); // Output: 4
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1; // minimum possible speed (1 banana/hour)
        int right = getMax(piles); // maximum possible speed (fastest pile)
        int result = right;

        // Binary search for the smallest valid speed
        while (left <= right) {
            int mid = left + (right - left) / 2; // current eating speed
            int hours = totalHours(piles, mid);

            if (hours <= h) {
                // ✅ Koko can finish within h hours, but try to slow down
                result = mid;
                right = mid - 1;
            } else {
                // ❌ Too slow, increase speed
                left = mid + 1;
            }
        }

        return result;
    }

    // Helper: find the largest pile
    private static int getMax(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    // Helper: calculate total hours needed for given eating speed k
    private static int totalHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += Math.ceil((double) pile / k); // each pile takes ceil(pile/k) hours
        }
        return hours;
    }
}
