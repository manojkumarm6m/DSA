package arrays.medium;

public class HouseRobber {
    private static int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;
        for (int i : nums) {
            int temp = Math.max(prev1, prev2 + i);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums)); // Output: 12
    }
}
