
import java.util.*;
public class ReverseString{


    // private static void reverseString(char[] chars){
    //     int left = 0, right = chars.length-1;
    //     while(left < right){
    //         char temp = chars[left];
    //         chars[left] = chars[right];
    //         chars[right] = temp;
    //         left++;
    //         right--;
    //     }
    //     System.out.println(Arrays.toString(chars));
    // }


    private static void reverseString(char[] chars){
            if (left>=right) return ;
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            reverseString( chars, left+1, right-1)
    }

    public static void main(String[] args){
        char[] chars =  {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
    }
}