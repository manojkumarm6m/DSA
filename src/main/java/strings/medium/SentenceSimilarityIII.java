package strings.medium;

public class SentenceSimilarityIII {

    public static int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
         while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (sb.indexOf(b) != -1) return count;
        sb.append(a);
        count++;
        if (sb.indexOf(b) != -1) return count;
        return -1; // not possible
    }


    public static void main(String[] args) {
        System.out.println(repeatedStringMatch("abcd", "cdabcdab")); // 3
        System.out.println(repeatedStringMatch("a", "aa"));          // 2
        System.out.println(repeatedStringMatch("abc", "cabcabca"));  // 4
        System.out.println(repeatedStringMatch("abc", "xyz"));       // -1
    }
}
