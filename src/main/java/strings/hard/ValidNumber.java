package strings.hard;

public class ValidNumber {


    public static boolean isNumber(String s) {
        s = s.trim();
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                numSeen = true;
            }
            else if (c == '.') {
                // dot can appear only once and before 'e'
                if (dotSeen || eSeen) return false;
                dotSeen = true;
            }
            else if (c == 'e' || c == 'E') {
                // 'e' must appear only once and after a number
                if (eSeen || !numSeen) return false;
                eSeen = true;
                numSeen = false; // must have digits after e
            }
            else if (c == '+' || c == '-') {
                // sign valid only at start or just after 'e'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                    return false;
            }
            else {
                return false; // invalid character
            }
        }

        return numSeen;
    }

        public static void main(String[] args) {
        String[] testCases = {
                "0", " 0.1 ", "abc", "1 a", "2e10", " -90E3   ",
                " 1e", "e3", " 6e-1", "99e2.5", "--6",
                "53.5e93", "3.", ".1", ".", "+.8", "+E3"
        };

        for (String s : testCases) {
            System.out.println("\"" + s + "\" → " + isNumber(s));
        }
    }
}
