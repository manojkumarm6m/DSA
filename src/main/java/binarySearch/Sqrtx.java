package binarySearch;

public class Sqrtx {

    private static int mySqrt(int num) {
        int left = 0, right = num / 2;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int square = mid * mid;
            if (square == num) return mid;
            else if (square < num) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int x1 = 4;
        int x2 = 8;
        int x3 = 25;
        int x4 = 2147395599; // edge test near sqrt(2^31 - 1)

//        System.out.println("sqrt(" + x1 + ") = " + mySqrt(x1)); // 2
        System.out.println("sqrt(" + x2 + ") = " + mySqrt(x2)); // 2
        System.out.println("sqrt(" + x3 + ") = " + mySqrt(x3)); // 5
        System.out.println("sqrt(" + x4 + ") = " + mySqrt(x4)); // 46339
    }
}
