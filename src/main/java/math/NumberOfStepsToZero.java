package math;

public class NumberOfStepsToZero {


    private static int numberOfSteps(int num){
        int steps = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        int num = 14;
        int result = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + result);
    }
}
