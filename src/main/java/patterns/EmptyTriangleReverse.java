public class EmptyTriangleReverse{

    public static void main(String[] args) {

        int n =5;

        for(int i=0; i<n; i++){
            
            if(i == 0){
                for(int j=0; j<n*2-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            else if(i == n-1){
                for(int j=0; j<n-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            else{
                for(int k = 0; k<i; k++){
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int l = 0; l<(n-1)*2 - (i*2) - 1 ; l++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
                
        }


    }
}
