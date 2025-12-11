

public class NumberOfStepsIterative {

    // public static int numberOfSteps(int num) {
    //     int step = 0;
    //     while(num > 0){
    //         if(num %2==0){
    //             num /=2;
    //         }else{
    //             num -=1;
    //         }
    //         step++;
    //     }
    //         return step;
    // }

    public static int numberOfSteps(int num) {
        if(num == 0) return 0;
        if(num %2==0){
            num/=2;
        }else{
            num -=1;
        }

        return 1 + numberOfSteps(num);
    }


public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println("Number of steps (Iterative): " + result);
    }

}