package math;

public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            xor ^= (i + 1);
        }

        int diffBit = xor & (-xor);
        int x = 0, y = 0;
        for (int num : nums) {
            if ((num & diffBit) != 0)
                x ^= num;
            else
                y ^= num;
        }
        for (int i = 1; i <= n; i++) {
            if ((i & diffBit) != 0)
                x ^= i;
            else
                y ^= i;
        }
        for (int num : nums) {
            if (num == x)
                return new int[]{x, y};
        }
        return new int[]{y, x};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing : " + result[1]);
    }
}

