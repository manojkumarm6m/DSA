package math;

public class DecimalToBinary {


    private static String decimalToBinary(int number) {
        StringBuilder stb = new StringBuilder();

        while (number > 0) {
            int rem = number % 2;
            number /= 2;
            stb.append(rem);
        }
        return stb.reverse().toString();
    }


    public static void main(String[] args) {
        int number = 10;
        System.out.println("Binary of " + number + " = " + decimalToBinary(number));
    }
}
