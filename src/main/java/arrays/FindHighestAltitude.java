package arrays;

public class FindHighestAltitude {

    private static int largestAltitude(int[] arr) {
        int max = 0, current = 0;
        for (int i: arr){
            current +=i;
            max = Math.max(current, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));  // Output: 1
    }
}
