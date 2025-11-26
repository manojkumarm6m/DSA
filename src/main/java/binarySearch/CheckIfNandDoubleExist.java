package binarySearch;

import java.util.HashSet;
import java.util.*;


public class CheckIfNandDoubleExist {


    private static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if ((set.contains(2 * i)) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};  // Example input
        boolean result = checkIfExist(arr);
        System.out.println("Result: " + result);
    }
}
