public class OpenTriangle{


    public static void main(String[] args){
       int n = 5;

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            for(int space = 0; space<n-i-1; space++){
                System.out.print("  ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

       
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int space = 0; space<i; space++){
                System.out.print("  ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        } 
        
    }
}