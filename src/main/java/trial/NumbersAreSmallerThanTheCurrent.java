package trial;


import java.util.*;
public class NumbersAreSmallerThanTheCurrent {

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res =new int[101];
        for (int i: nums) res[i]++;

        for(int i=1; i<101; i++){
            res[i] +=res[i - 1];
        }
            int[] result = new int[nums.length];
        for (int i=0; i< nums.length; i++){
            result[i] = nums[i]==0?0: res[nums[i] - 1];
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {8, 0, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

}
