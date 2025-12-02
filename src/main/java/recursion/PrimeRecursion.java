public class PrimeRecursion {

    private static boolean isPrime(int n, int i){
        if (n <= 2) return n == 2;

        if (n % i == 0){
            return false;
        }

        if(i*i > n){
            return true;
        }
        return isPrime(n, i+1);
    }


     public static void main(String[] args) {
        int n = 29;

        if (isPrime(n, 2))
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}