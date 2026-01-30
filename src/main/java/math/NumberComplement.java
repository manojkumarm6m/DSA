package math;

public class NumberComplement {

    public static int findComplement(int num) {
        int bits = 0;
        int temp = num;
        while (temp > 0) {
            bits++;
            temp = temp >> 1;
        }
        int mask = (1 << bits) - 1;
        return num ^ mask;
    }

    public static void main(String[] args) {
        int num = 5;
        int complement = findComplement(num);
        System.out.println("Number     : " + num);
        System.out.println("Complement : " + complement);
    }
}

