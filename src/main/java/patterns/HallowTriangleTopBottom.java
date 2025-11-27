public class HallowTriangleTopBottom{


    public static void main(String[] args){
            int n = 5;
            for(int i=0; i<n; i++){
                for(int space=0; space<n-i-1; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i!=0){
                    for(int space=0; space<i*2-1; space++){
                    System.out.print(" ");
                }
                System.out.println("*");
                }else {
                    System.out.println();
                }
                
            }
//Phase 2
            for(int i=0; i<n-1; i++){
                for(int space=0; space<i+1; space++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i != n-2){
                    for(int space=0; space<n-i*2; space++){
                    System.out.print(" ");
                }
                System.out.println("*");
                }
            }
    }
}