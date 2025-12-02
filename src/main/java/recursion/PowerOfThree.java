public class PowerOfThree{

    // private static boolean isPowerOfThree(int n) {
    //    if(n<1) return false;
    //     while(n>1){
    //         if(n%3 == 0){
    //             n/=3;}
    //         else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    
    public static void main(String[] args) {
        int n = 45; // Change to test other values
        
        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is NOT a power of three.");
        }
    }
}