import java.util.*;
public class reverseStringByStack {
    public static void main(String [] arg){
        Stack<Character> myStk = new Stack<>();
        String str = "swap";

        StringReverser(myStk, str, str.length());
       // System.out.print(str);



       


    }

    public static void StringReverser(Stack<Character> myStk, String str, int index){
        
        if(index>=1){
        char contain =  str.charAt(index-1);
        index--;
        System.out.println(contain);
        StringReverser(myStk, str,index);
        
      
     }
    }
   }
