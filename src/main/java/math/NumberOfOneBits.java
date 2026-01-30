package math;

public class NumberOfOneBits {

    private static int hammingWeight(int n){
        int count = 0;

        while(n!=0){
            n &= (n - 1);
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 11;
        System.out.println("Number of 1 bits: " + hammingWeight(n));
    }
}
