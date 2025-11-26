package strings.medium;

import java.util.*;

public class PrintWordsVertically {
    public static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int maxLen = 0;

        // find the longest word length
        for (String word : words) {
            maxLen = Math.max(maxLen, word.length());
        }

        List<String> result = new ArrayList<>();

        // loop column by column
        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i < word.length()) sb.append(word.charAt(i));
                else sb.append(' ');
            }
            // remove trailing spaces
            int end = sb.length() - 1;
            while (end >= 0 && sb.charAt(end) == ' ') end--;
            result.add(sb.substring(0, end + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "HOW ARE YOU";
        System.out.println(printVertically(s)); // Output: [HAY, ORO, WEU]
    }
}

