package recursion.mediumRecursion;

import java.util.*;

public class CombinationSumIII {

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int k, int target,
                                  List<Integer> current,
                                  List<List<Integer>> result) {
        if (current.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > target) {
                break;
            }
            current.add(i);
            backtrack(i + 1, k, target - i, current, result);
            current.remove(current.size() - 1);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));   // [[1, 2, 4]]
        System.out.println(combinationSum3(3, 9));   // [[1,2,6], [1,3,5], [2,3,4]]
        System.out.println(combinationSum3(4, 1));   // []
    }
}
