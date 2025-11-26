package strings;

public class HalvesAreAlike {


    private static boolean halvesAreAlike(String s){
        int n = s.length();
        int vowelsFirst = 0, vowelsSecond = 0;

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < n / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) vowelsFirst++;
            if (vowels.indexOf(s.charAt(i + n / 2)) != -1) vowelsSecond++;
        }

        return vowelsFirst == vowelsSecond;
    }


    public static void main(String[] args) {
        String s = "book";
        System.out.println("Input: " + s);
        System.out.println("Halves are alike? " + halvesAreAlike(s));
    }
}
