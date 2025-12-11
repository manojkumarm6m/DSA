public class FactorialRecursive{


    private static long factorial(int n){
        if(n == 1) return 1;
        return n * (factorial(n-1));
    }


    public static void main(String[] args) {
        int n = 5; // Change this to test other values
        long result = factorial(n);

        System.out.println("Factorial of " + n + " = " + result);
    }
}