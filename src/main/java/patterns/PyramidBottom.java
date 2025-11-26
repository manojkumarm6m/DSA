package patterns;

public class PyramidBottom {


    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= (2 * n - (i * 2)); k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
