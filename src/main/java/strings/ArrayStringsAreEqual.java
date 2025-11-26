package strings;

public class ArrayStringsAreEqual {

    private static boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String s : w1) s1.append(s);
        for (String s : w2) s2.append(s);

        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println("Are the arrays equivalent? " + arrayStringsAreEqual(word1, word2));
    }
}
