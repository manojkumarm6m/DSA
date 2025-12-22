package recursion.mediumRecursion;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    static Map<String, Integer> memo;

    public static int findTargetSumWays(int[] nums, int target) {
        memo = new HashMap<>(); // 🔥 RESET memo every time
        return dfs(nums, 0, 0, target);
    }

    private static int dfs(int[] nums, int index, int sum, int target) {

        // Base case
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        String key = index + "," + sum;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int add = dfs(nums, index + 1, sum + nums[index], target);
        int subtract = dfs(nums, index + 1, sum - nums[index], target);

        memo.put(key, add + subtract);
        return add + subtract;
    }

    public static void main(String[] args) {

        int[] nums = {1};
        int target = 1;

        System.out.println(findTargetSumWays(nums, target)); // ✅ 1
    }
}
