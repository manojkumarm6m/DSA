public class EmptyTriangle{


    public static void main(String[] args) {

        int n =5;

        for(int i=0; i<n; i++){
            
            if(i == 0){
                for(int j=0; j<n-1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            else if(i == n-1){
                for(int j=0; j<i*2+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            else{
                for(int k = 0; k<n-i-1; k++){
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int l = 0; l<i*2-1; l++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
                
        }


    }
}
