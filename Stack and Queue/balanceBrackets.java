import java.util.*;

public class balancedBrackets{
   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      System.out.println(balancedBrackets(exp));
   }

   public static boolean balancedBrackets(String exp){
      Stack<Character> st = new Stack<>();

      for(int i = 0 ; i < exp.length() ; i++){

         char ch = exp.charAt(i);
         if(ch == '(' || ch == '[' || ch == '{'){
            st.push(ch);
         }else if(ch == ')'){
            if(st.size() == 0 || st.peek() != '('){
               return false;
            }
            st.pop();
         }else if(ch == ']'){
            if( st.size() == 0 || st.peek() != '['){
               return false;
            }
            st.pop();
         }else if(ch == '}'){
            if( st.size() == 0 || st.peek() != '{'){
               return false;
            }
            st.pop();
         }
         
      }

      if(st.size() == 0){
         return true;
      }else{
         return false;
      }
      
   }
}