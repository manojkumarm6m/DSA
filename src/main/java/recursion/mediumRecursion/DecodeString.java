package recursion.mediumRecursion;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(currentNumber);
                stringStack.push(currentString);
                currentNumber = 0;
                currentString = new StringBuilder();
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prevString = stringStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prevString.append(currentString);
                }
                currentString = prevString;
            }
            else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));   // aaabcbc
        System.out.println(decodeString("3[a2[c]]"));    // accaccacc
    }
}
