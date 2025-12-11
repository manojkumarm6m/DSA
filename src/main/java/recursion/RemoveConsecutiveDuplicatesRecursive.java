public class RemoveConsecutiveDuplicatesRecursive {


    private static String removeDuplicates(String s){
        // Base case
        if (s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return removeDuplicates(s.substring(1));
        }
        return  s.charAt(0)+removeDuplicates(s.substring(1));
    }



     public static void main(String[] args) {
        String input = "aaabbccddee";

        String result = removeDuplicates(input);
        System.out.println(result);  // Output: abcde
    }
}