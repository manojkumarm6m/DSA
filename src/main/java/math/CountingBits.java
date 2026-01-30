package math;

public class CountingBits {

    private static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + (i % 2);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        System.out.print("Output: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
