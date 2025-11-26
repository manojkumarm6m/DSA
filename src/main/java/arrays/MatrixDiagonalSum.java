package arrays;

public class MatrixDiagonalSum {

    private static int diagonalSum(int[][] mat) {
        int total = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            total += mat[i][i];
            total += mat[i][n-1-i];
        }
        if (n % 2 == 1) total -= mat[n / 2][n / 2];
        return total;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));  // Output: 25
    }
}
