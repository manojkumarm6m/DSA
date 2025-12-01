public class SumNaturalNumbers{

    private static int sum(int n){
        if(n == 1) return 1;
        return n + sum(n-1);
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
    }
}