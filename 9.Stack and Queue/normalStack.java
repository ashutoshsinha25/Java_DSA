import java.io.*;
import java.util.*;

public class normalStack {
  public static class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
      data = new int[cap];
      tos = -1;
    }

    int size() {
      // write ur code here
      return tos + 1;
    }

    void display() {
      // write ur code here
      for(int idx = tos ; idx >= 0 ; idx--){
        System.out.print(data[idx] + " ");
      }
      System.out.println();
    }

    void push(int val) {
      // write ur code here
      if(size() == data.length){
        System.out.println("Stack overflow");
        // return -1;
      }else{
        tos++;
        data[tos] = val;
      }
    }

    int pop() {
      // write ur code here
      if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      }else{
        int ele = data[tos];
        tos--;
        return ele;
      }
      // return -1;
    }

    int top() {
       // write ur code here
       if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      }else{
        int ele = data[tos];
        // tos--;
        return ele;
      }
      
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomStack st = new CustomStack(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("display")){
        st.display();
      }
      str = br.readLine();
    }
  }
}