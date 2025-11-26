package strings;

public class ReverseWordsInStringIII {

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1;
            }
        }
        return new String(chars);
    }

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s)); // s'teL ekat edoCteeL tsetnoc
    }
}
