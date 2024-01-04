import java.util.*;

public class balanceBrackets{
   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      System.out.println(balancedCheck(exp));
      System.out.println(balanced(exp));

      scn.close();
   }
   public static boolean balancedCheck(String s ){
      Stack<Character> st = new Stack<>();
      for(int i=0;i<s.length();i++){
         char val = s.charAt(i);
         if(val == ')'){
            if(st.size() == 0 || st.peek() != '('){
               return false;
            }
            st.pop();
         }else if(val ==']'){
            if(st.size() == 0 || st.peek() != '['){
               return false;
            }
            st.pop();
         }else if(val =='}'){
            if(st.size() == 0 || st.peek() != '{'){
               return false;
            }
            st.pop();
         }else if(val =='(' || val =='[' || val =='{'){
            st.push(val);
         }         
      }

      return st.size() == 0 ? true : false;

   }
   public static boolean balanced(String exp){
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