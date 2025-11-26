package arrays;

public class MinimumCostToMoveChips {


    private static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return even > odd ? odd: even;
    }


    public static void main(String[] args) {
        int[] position = {1, 2, 3};
        int result = minCostToMoveChips(position);
        System.out.println("Minimum cost to move all chips: " + result);
    }
}
