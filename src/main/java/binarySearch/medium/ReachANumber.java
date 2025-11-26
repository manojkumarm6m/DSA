package binarySearch.medium;

public class ReachANumber  {
    public static int reachNumber(int target) {
        target = Math.abs(target); // Symmetry: same for + or - target
        int sum = 0;
        int steps = 0;

        while (sum < target || (sum - target) % 2 == 1) {
            steps++;
            sum += steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        System.out.println(reachNumber(2)); // Output: 3
        System.out.println(reachNumber(3)); // Output: 2
    }
}
