package patterns;

public class BottomRightAngleTriangle {

    public static void main(String[] args) {
        int n = 5;
        int temp = 1;
        while (temp <= n) {

            for (int i = 0; i < temp - 1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - temp; j++) {
                System.out.print("*");
            }
            temp++;
            System.out.println();
        }
    }
}
