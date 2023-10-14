import java.util.*;

public class validParentheses {
    public static void main(String arg[]) {
        String pare = "{[]}{}";

        System.out.print(parenthesisChecker(pare));

    }

    public static boolean parenthesisChecker(String str) {

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch == '{') || (ch == '[') || (ch == '(')) {
                stk.push(ch);
            }

            if ((ch == '}') && (stk.peek() == '{')) {
                stk.pop();
            }

            if ((ch == ']') && (stk.peek() == '[')) {
                stk.pop();
            }

            if ((ch == ')') && (stk.peek() == '(')) {
                stk.pop();
            }

        }

        return stk.isEmpty();

    }

}
