package math;

public class CountConsistentStrings {

    public static int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for (char c : allowed.toCharArray()) {
            mask |= 1 << (c - 'a');
        }
        int count = 0;// Check each word
        for (String word : words) {
            boolean ok = true;
            for (char c : word.toCharArray()) {
                if ((mask & (1 << (c - 'a'))) == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words)); // 2
    }
}

