package recursion.mediumRecursion;

public class IncreasingNDigitNumbers {
    
    public static int countIncreasingNumbers(int N) {
        if (N > 10) {
            return 0;
        }
        return nCr(10, N) - nCr(9, N - 1);
    }

    public static int nCr(int n, int r) {
        if (r > n) return 0;

        int result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

     public static void main(String[] args) {

        int N1 = 1;
        int N2 = 2;
        int N3 = 3;

        System.out.println("N = 1 → " + countIncreasingNumbers(N1)); // 9
        System.out.println("N = 2 → " + countIncreasingNumbers(N2)); // 36
        System.out.println("N = 3 → " + countIncreasingNumbers(N3)); // 84
    }
}
