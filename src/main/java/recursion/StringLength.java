public class StringLength{

    private static int findLength(String s){
        if(s.equals("")) return 0;

        return 1 + findLength(s.substring(1));
    }


    public static void main(String[] args){
        String s = "Hello World";
        int length = findLength(s);
        System.out.println("Length of the string: " + length);
    }
}