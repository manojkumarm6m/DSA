package arrays;

public class EvenDigitNumbers {

    public static int findNumbersOptimized(int[] nums) {
        int count = 0;
        for (int i: nums){
            int num = (int)Math.log10(i) + 1;
            if (num % 2 ==0) count++;
        }
        return count;

    }
        public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbersOptimized(nums));  // Output: 2
    }
}
