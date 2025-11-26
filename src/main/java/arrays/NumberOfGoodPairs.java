package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {


    private static int numIdenticalPairs(int[] arr) {
        int pair = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            int num = freq.getOrDefault(i, 0);
            pair += num;
            freq.put(i, num + 1);
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums)); // expected 4
    }
}
