package strings;

public class ToLowerCase {

    private static String toLowerCase(String s){
        char[] chars = s.toCharArray();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)>= 65 && s.charAt(i)<=90){
                chars[i] = (char) (s.charAt(i) + 32);
            }
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println("Original: " + input);
        System.out.println("Lowercase: " + toLowerCase(input));
    }
}
