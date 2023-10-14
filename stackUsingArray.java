import java.util.*;
 public class stackUsingArray {
     public static void main(String[] args){
        STACK s = new STACK();
       s.push(5);
       s.push(7);
       s.push(8);
       s.push(9);
       s.push(10);
       s.push(11);
       s.push(3);
       
    int i=7;
    while(i>=1){
        s.peek();
        System.out.println();
        s.pop();
        i--;
    }
     
    }
   
    static class STACK {
        static ArrayList <Integer> stack = new ArrayList<>();

         public boolean isEmpty(){
            if(stack.size()!=0)
            return false;
            else
            return true;
        }

         public void push(int data){
        stack.add(data);
        }

         public int pop(){
            if(isEmpty()){
            return 0;}
            else{
        int top = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
            }
         }

        public void peek(){
        int top = stack.get(stack.size()-1);
        System.out.print(top);
        } 
    }       
}
