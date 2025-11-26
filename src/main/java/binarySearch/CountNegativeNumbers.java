package binarySearch;

public class CountNegativeNumbers {


    public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int r = rows - 1;
        int cols = grid[0].length;
        int c = 0;
        int total =0;

        while (r >= 0 && c < cols) {
            if (grid[r][c] < 0){
                total += (cols - c);
                r--;
            }else {
                c++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        int result = countNegatives(grid);
        System.out.println("Total Negative Numbers: " + result);
    }
}
