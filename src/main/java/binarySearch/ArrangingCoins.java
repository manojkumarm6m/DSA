package binarySearch;

public class ArrangingCoins {


    private static int arrangeCoins(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = (long) mid * (mid + 1) / 2;
            if (sum == num) return mid;
            else if (sum < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 8;
        int n3 = 1804289383; // big number test

        System.out.println(n1 + " → " + arrangeCoins(n1)); // Output: 2
        System.out.println(n2 + " → " + arrangeCoins(n2)); // Output: 3
        System.out.println(n3 + " → " + arrangeCoins(n3)); // large test
    }
}
