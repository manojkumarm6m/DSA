package arrays;

public class TransposeMatrix {

    private static int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] abd = new int[column][row];

        for (int j =0; j<row; j++){
            for (int i=0; i<column; i++){
                abd[i][j] = matrix[j][i];
            }
        }
        return abd;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] result = transpose(matrix);
        for (int[] row : result)
            System.out.println(java.util.Arrays.toString(row));  // Output: [1, 4], [2, 5], [3, 6]
    }
}
