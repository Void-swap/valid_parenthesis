import java.util.*;
public class reverseStack {
    public static void main(String arg[]){
        Stack <Integer> stk = new Stack<>();
        Stack <Integer> stkk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
                
       stackReverse(stk, stkk);

      System.out.println(stkk.peek());
      stkk.pop();
      System.out.println(stkk.peek());
      stkk.pop();
    }

    public static void stackReverse(Stack<Integer> stk,Stack<Integer> stkk){
        for(int i=0 ; i<=stk.size(); i++){
        stkk.push(stk.pop());
        }
    }
}
