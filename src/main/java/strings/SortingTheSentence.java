package strings;

import java.time.chrono.MinguoDate;

public class SortingTheSentence {

    private static String sortSentence(String s) {
        String[] split = s.split(" ");
        String[] sorted = new String[split.length];
        for (String str : split) {
            int index = (int) str.charAt(str.length()-1) - '0' - 1;
            sorted[index] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", sorted);
    }


    public static void main(String[] args) {
        String sentence = "is2 sentence4 This1 a3";
        System.out.println("Input: " + sentence);
        System.out.println("Output: " + sortSentence(sentence));
    }
}
