package strings;

public class DecryptString {

    private static String freqAlphabets(String s) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                stb.append((char) ('a' + (Integer.parseInt(s.substring(i, i + 2)) - 1)));
                i += 3;
            } else {
                int num = s.charAt(i) - '0';
                stb.append((char) ('a' + num - 1));
                i++;
            }
        }
        return stb.toString();
    }


    public static void main(String[] args) {

        String t = "10#11#12";
        System.out.println(t + " -> " + freqAlphabets(t));
//        String[] tests = {"10#11#12", "1326#", "25#", "123456789"};
//        for (String t : tests) {
//            System.out.println(t + " -> " + freqAlphabets(t));
//        }
    }
}
