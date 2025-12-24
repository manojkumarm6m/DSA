package recursion.mediumRecursion;

public class CircularGameWinner {
      public static int findTheWinner(int n, int k) {
        int winner = 0; // 0-based index
        for (int size = 2; size <= n; size++) {
            winner = (winner + k) % size;
        }
        return winner + 1;
    }
    public static void main(String[] args) {
            System.out.println(findTheWinner(5, 2)); // 3
        
        }
        
}
