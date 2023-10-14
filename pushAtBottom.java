import java.util.*;
public class pushAtBottom {
  
    public static void main(String [] arg){
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> helperStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        pushBttm(myStack, 8, helperStack);
        pushBttm(myStack,9,helperStack);

        
        while(!myStack.isEmpty()){
            System.out.print(myStack.peek()+"\t");
            myStack.pop();
            
        }
        
    }

    //SELF-MADE
    public static void pushBttm(Stack<Integer> myStack, int element,Stack<Integer> helperStack){
        int size = myStack.size();
        if(size !=0){
        int elem=myStack.pop();
        helperStack.push(elem);                               // transfering element to HELPING ARRAY
        pushBttm(myStack, element,helperStack);  //RECURSSION
        int elem2 = helperStack.pop();                   
        myStack.push(elem2);                                  // transfering back elements in REAL ARRAY  (this will take place while backtracking)
        }
        else{
            myStack.push(element);                           //PUSHING element on BOTTOM
        }
    }


    //ONLINE-REFERENCE
    public static void pushBttm2(Stack<Integer> stk , int elem){
        if(!stk.isEmpty()){
           int top= stk.pop();
            pushBttm2(stk, elem);
            stk.push(top);
        }
        else{
            stk.push(elem);
        }
    }
}
