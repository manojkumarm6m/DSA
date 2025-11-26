package binarySearch;

public class GuessNumberHigherOrLower {
    private static int pickedNumber;

    private static int guess(int num) {
        if (num == pickedNumber) return 0;
        return num > pickedNumber ? -1 : 1;
    }

    private static int guessNumber(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int n = 10;
        pickedNumber = 6; // Simulate that system picked 6

        System.out.println("Guessed Number: " + guessNumber(n)); // Output: 6
    }
}
