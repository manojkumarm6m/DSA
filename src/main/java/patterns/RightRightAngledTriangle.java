package patterns;

public class RightRightAngledTriangle {


    public static void main(String[] args) {
        int n =5;
        int temp = 1;
        while (temp <= n) {
            for (int i=0; i < n - temp; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < temp; j++) {
                System.out.print("*");
            }
            temp++;
            System.out.println();
        }
    }
}
