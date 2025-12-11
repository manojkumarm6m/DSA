public class BalancedParenthesisRecursive {


    public static boolean isBalanced(String str, int index, int round, int curly, int square) {
        if(round < 0 || curly < 0 || square < 0 ){
            return false;
        }
        if(index == str.length()) return round == 0 && curly == 0 && square == 0;


        char c = str.charAt(index);
        switch(c){
            case '(': return isBalanced(str, index+1, round+1, curly, square);
            case '{': return isBalanced(str, index+1, round, curly+1, square);
            case '[': return isBalanced(str, index+1, round, curly, square+1);

            case ')': return isBalanced(str, index+1, round-1, curly, square);
            case '}': return isBalanced(str, index+1, round, curly-1, square);
            case ']': return isBalanced(str, index+1, round, curly, square-1);
        }

          return isBalanced(str, index + 1, round, curly, square);
    }


    public static void main(String[] args) {

        String exp = "[()]{}{[()()]()}";

        if (isBalanced(exp, 0, 0, 0, 0)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }  
}