package math;

public class Learn {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1;     // get last bit
            result = result << 1;    // shift result left
            result = result | lastBit;
            n = n >> 1;              // shift n right
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int reversed = reverseBits(n);
        System.out.println("Input  : " + n);
        System.out.println("Output : " + reversed);
    }
}
