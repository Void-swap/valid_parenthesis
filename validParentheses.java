import java.util.*;

public class hp {
    public static void main(String arg[]) {
        String pare = "{()[]}()";

        System.out.print(parenthesisChecker(pare));
    }

    public static boolean parenthesisChecker(String str) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else if (stk.isEmpty()) {
                // If the stack is empty return
                return false;
            } else if (ch == '}' && stk.peek() == '{') {
                stk.pop();
            } else if (ch == ']' && stk.peek() == '[') {
                stk.pop();
            } else if (ch == ')' && stk.peek() == '(') {
                stk.pop();
            }
        }
        //still is stk empty or not
        return stk.isEmpty();
    }
}
