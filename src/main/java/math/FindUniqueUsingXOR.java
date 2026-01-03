package math;

public class FindUniqueUsingXOR {

    private static int findUnique(int[] arr){
        int unique = 0;
        for (int i: arr){
            unique ^=i;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println(findUnique(arr)); // Output: 4
    }
}
