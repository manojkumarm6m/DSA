package arrays;

import java.util.*;

public class FindNUniqueIntegersSumZero {
    private static int[] sumZero(int n) {
        int[] res = new int[n];
        int start = 0, last = n - 1;
        int index = 1;
        while (start < last) {
            res[start++] = index;
            res[last--] = -index;
            index++;
        }
//        if (n %2==1) res[n%2] = 0;
        return res;

    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));  // Output: [1, 2, 0, -2, -1]
    }
}
