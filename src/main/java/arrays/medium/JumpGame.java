package arrays.medium;

public class JumpGame {

    private static boolean canJump(int[] arr) {
        int maxReach = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i > maxReach) return false;
            maxReach = Math.max(maxReach, i + arr[i]);
            if (maxReach >= arr.length-1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4}; // Expected output: true
        System.out.println(canJump(nums));
    }
}
