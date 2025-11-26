package strings;

public class RobotReturnToOrigin {


    private static boolean judgeCircle(String s) {
        int up = 0, down = 0, left = 0, right = 0;
        for (char c : s.toCharArray()) {
            if (c == 'U') up++;
            else if (c == 'D') {
                down++;
            } else if (c == 'L') {
                left++;
            } else {
                right++;
            }
        }
        return left == right && up == down;
    }


    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));   // true
        System.out.println(judgeCircle("LL"));   // false
        System.out.println(judgeCircle("URDL")); // true
        System.out.println(judgeCircle("UUDDLRLR")); // true
    }

}
