package strings;

public class ReversePrefixOfWord {


    private static String reverse(int s, int e, String word) {
        char chars[] = word.toCharArray();
        while (s < e) {
            char temp = chars[s];
            chars[s++] = chars[e];
            chars[e--] = temp;
        }
        return new String(chars);
    }


    public static String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;

        String rex = reverse(0, idx, word);

        return rex;

    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        String result = reversePrefix(word, ch);
        System.out.println("Reversed prefix: " + result);
    }
}
