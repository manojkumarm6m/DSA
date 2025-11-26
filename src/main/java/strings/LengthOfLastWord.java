package strings;

public class LengthOfLastWord {

    private static int lengthOfLastWord(String s) {
        int count = 0;
        int right = s.length() - 1;

        while (s.charAt(right) == ' ') {
            right--;
        }

        while (s.charAt(right) != ' ') {
            count++;
            right--;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }
}
