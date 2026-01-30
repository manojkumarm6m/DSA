package math;

public class BinaryToDecimalSimple {

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 1;   // represents 2^0 initially

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal = decimal + bit * power;
            power = power * 2;
        }

        return decimal;
    }

    public static void main(String[] args) {
        String binary = "1011";
        System.out.println("Decimal = " + binaryToDecimal(binary));
    }
}
