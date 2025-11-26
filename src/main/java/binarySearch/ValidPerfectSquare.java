package binarySearch;

public class ValidPerfectSquare {


    public static boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sum = (long) mid * mid;
            if (sum == num) return true;
            else if (sum < num) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;
        System.out.println(num1 + " → " + isPerfectSquare(num1)); // true
        System.out.println(num2 + " → " + isPerfectSquare(num2)); // false
    }
}
