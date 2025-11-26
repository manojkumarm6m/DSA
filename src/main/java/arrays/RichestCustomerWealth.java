package arrays;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int sum = 0;
            for (int money : customer) {
                sum += money;
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };

        int result = maximumWealth(accounts);
        System.out.println("Accounts: " + Arrays.deepToString(accounts));
        System.out.println("Richest customer wealth: " + result);
    }
}











