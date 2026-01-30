package math;

public class HammingDistance {

    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        int distance = hammingDistance(x, y);
        System.out.println("Hamming Distance: " + distance);
    }
}

