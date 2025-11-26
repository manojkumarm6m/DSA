package strings.hard;

import java.util.*;


public class BasicCalculator {
    public static void main(String[] args) {
        String[] inputs = {
//                "2-1+2",
                "(1+(4+5+2)-3)+(6+8)"
        };
        for (String s : inputs) {
            System.out.println(calculate(s));
        }
    }

    public static int calculate(String s) {
        int res = 0;
        int sign = 1;
        int num = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '+') {
                res += sign * num;
                num = 0;
                sign = 1;
            }
            else if (c == '-') {
                res += sign * num;
                num = 0;
                sign = -1;
            }
            else if (c == '(') {
                stack.push(res);
                stack.push(sign);
                res = 0;
                sign = 1;
            }
            else if (c == ')') {
                res += sign * num;
                num = 0;
                res *= stack.pop();   // pop sign
                res += stack.pop();   // pop previous result
            }
        }
        return res + sign * num;
    }
}
