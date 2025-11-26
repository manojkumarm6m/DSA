package arrays;


import java.util.*;

public class PlusOne {


    private static int[] plusOne(int[] arr) {

        int n = arr.length - 1;
        for (int i = n; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
        }
        int[] res = new int[arr.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 1};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 0, 0, 0]
    }
}
