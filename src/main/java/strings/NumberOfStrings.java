package strings;

public class NumberOfStrings {
    private static int numOfStrings(String[] patters, String word){
        int count = 0;
        for (String s: patters){
            if (word.contains(s)){
                count++;
            };
        }
        return count;
    }

    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word)); // Output: 3
    }
}
