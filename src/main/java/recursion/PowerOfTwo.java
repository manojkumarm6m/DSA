public class PowerOfTwo{

    // private static boolean isPowerOfTwo(int n){
    //     if(n <= 0) return false;

    //     while(n%2==0){
    //         n = n/2;
    //     }
    //     return n == 1;
    // }

    private static boolean isPowerOfTwo(int n){
        if(n <= 0) return false;
        if(n == 1) return true;
        return isPowerOfTwo(n/=2);
    }

    public static void main(String[] args) {
        int n = 16;
        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of two.");
        } else {
            System.out.println(n + " is NOT a power of two.");
        }
    }
}