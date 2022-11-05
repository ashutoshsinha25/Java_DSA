import java.io.*;
import java.util.*;

public class infixEvaluate{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code

    Stack<Integer> oper = new Stack<>();
    Stack<Character> helper = new Stack<>();

    for(int i = 0 ; i< exp.length() ; i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            helper.push(ch);
        }
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
            while(helper.size() > 0 && helper.peek() != '(' && precedence(ch) >= precedence(helper.peek())){
                evaluate(oper , helper.pop());
            }
            helper.push(ch);
        }else if('0' <= ch && ch <= '9'){
            oper.push(ch - '0');
        }else if(ch == ')'){
            while(helper.peek() != '('){
                evaluate(oper, helper.pop());
            }
            helper.pop();
        }
    }
    while(helper.size() > 0){
        evaluate(oper , helper.pop());
    }
    System.out.println(oper.pop());
 }
public static void evaluate(Stack<Integer> oper , char op){
    int v2 = oper.pop() , v1 = oper.pop();
    if(op == '+') oper.push(v1 + v2);
    if(op == '-') oper.push(v1 - v2);
    if(op == '*') oper.push(v1*v2);
    if(op == '/') oper.push(v1/v2);
}
 public static int precedence(char op){
     int ans = 0;
     if(op == '+') ans = 2;
     if(op == '-') ans = 2;
     if(op == '*') ans = 1;
     if(op == '/') ans = 1;
     return ans;
 }
}