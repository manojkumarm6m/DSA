package strings;

public class ValidPalindromeII {

    private static boolean isPalindromeCheck(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPalindromeCheck(s, left + 1, right) || isPalindromeCheck(s, left, right - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));   // true
        System.out.println(validPalindrome("abca"));  // true
        System.out.println(validPalindrome("abc"));   // false
        System.out.println(validPalindrome("deeee")); // true
    }
}
