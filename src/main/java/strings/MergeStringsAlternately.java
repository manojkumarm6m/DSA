package strings;

public class MergeStringsAlternately {

    private static String mergeAlternately(String s1, String s2) {
        StringBuilder stb = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() || j < s2.length()) {
            if (i < s1.length()) stb.append(s1.charAt(i++));
            if (j < s2.length()) stb.append(s2.charAt(j++));
        }
        return stb.toString();
    }


    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));   // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));   // apbqrs
        System.out.println(mergeAlternately("abcd", "pq"));   // apbqcd
    }
}
