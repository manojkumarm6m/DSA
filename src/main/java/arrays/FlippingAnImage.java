package arrays;

public class FlippingAnImage {


    private static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int start = 0, last = row.length - 1;
            while (start <= last) {
                int temp = row[start] ^ 1;
                row[start] = row[last] ^ 1;
                row[last] = temp;
                start++;
                last--;
            }

        }
        return image;
    }


    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] result = flipAndInvertImage(image);
        for (int[] row : result)
            System.out.println(java.util.Arrays.toString(row));
    }
}
