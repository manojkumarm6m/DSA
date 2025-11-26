package arrays;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestCandies {


    private static List<Boolean> kidsWithCandies(int[] candies, int n) {
        int max = Integer.MIN_VALUE;
        List<Boolean> list = new ArrayList<>();
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : candies) {
            if (i + n >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
