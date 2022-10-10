import java.util.*;
public class duplicateBrackets{
   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      String exp = scn.nextLine();
      System.out.println(checkDuplicate(exp));
      scn.close();
   }

   public static boolean checkDuplicate(String exp){
      Stack<Character> st = new Stack<>();

      for(int i=0 ; i<exp.length() ; i++){
         char ch = exp.charAt(i);
         if(ch == ' ') continue;
         else if(ch == ')'){
               if(st.peek() == '('){
                  return true;
               }else{
                  while(st.peek() != '('){
                     st.pop(); // remove middle contents
                  }
                  st.pop(); // opening bracket
               }
         }else{
            st.push(ch);
         }
      }

      return false;
   }
}