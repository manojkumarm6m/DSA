package strings;

public class GoalParserInterpretation {

    private static String interpret(String command) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i <= command.length() - 1; ) {

            if (command.charAt(i) == 'G') {
                stb.append('G');
                i++;
            } else {
                if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                    stb.append('o');
                    i += 2;
                } else {
                    stb.append("al");
                    i+=4;
                }
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println("Input: " + command);
        System.out.println("Output: " + interpret(command));
    }
}
