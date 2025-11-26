package arrays;

import java.util.*;

public class CreateTargetArrayInGivenOrder {


    private static int[] createTargetArray(int[] arr, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(index[i], arr[i]);
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
}
