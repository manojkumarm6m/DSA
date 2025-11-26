package strings;

import java.util.Stack;

public class ValidParentheses {

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) return false;
                char poped = stack.pop();
                if ((poped == '{' && c != '}') ||
                        (poped == '(' && c != ')') ||
                        (poped == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s)); // Output: true
    }
}
