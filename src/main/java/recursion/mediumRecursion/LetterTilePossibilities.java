package recursion.mediumRecursion;

public class LetterTilePossibilities {

    public static int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }
        return backtrack(freq);
    }
    private static int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                freq[i]--;
                count++;
                count += backtrack(freq);
                freq[i]++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        System.out.println(numTilePossibilities("V"));
//        System.out.println(numTilePossibilities("AB"));
        System.out.println(numTilePossibilities("ABC"));
//        System.out.println(numTilePossibilities("AAB"));
    }
}
