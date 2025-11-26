package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayForm {


    private static List<Integer> addToArrayForm(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length - 1;
        for (int i = n; i >= 0 || k > 0; i--) {
            if (i >= 0) k += arr[i];
            list.add(0, k % 10);
            k /= 10;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(num, k));  // Output: [1,2,3,4]
    }
}
