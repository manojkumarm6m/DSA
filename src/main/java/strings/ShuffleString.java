package strings;

public class ShuffleString {

    private static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        System.out.println("Original String: " + s);
        System.out.println("Shuffled String: " + restoreString(s, indices));
    }
}
