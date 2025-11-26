package strings.medium;


public class SplitTwoStringsPalindrome {

    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    private static boolean check(String a, String b) {
        int i = 0;
        int j = a.length() - 1;

        // Move pointers while characters match
        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }

        // Check remaining substring in either a or b
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String a1 = "abdef";
        String b1 = "fecab";
        System.out.println(checkPalindromeFormation(a1, b1)); // true

        String a2 = "ulacfd";
        String b2 = "jizalu";
        System.out.println(checkPalindromeFormation(a2, b2)); // true

        String a3 = "abc";
        String b3 = "xyz";
        System.out.println(checkPalindromeFormation(a3, b3)); // false
    }
}
