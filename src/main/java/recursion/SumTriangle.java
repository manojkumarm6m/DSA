import java.util.*;

public class SumTriangle {

    private static void printSumTriangle(int[] arr){
        if(arr.length  ==0) return ;
        int[] next = new int[arr.length -1];
        for(int i=0; i<arr.length-1; i++){
            next[i] = arr[i] + arr [i+1];
        }
        printSumTriangle(next);
        System.out.println(Arrays.toString(arr));
    }


     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSumTriangle(arr);
    }
}
