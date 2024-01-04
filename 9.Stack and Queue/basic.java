import java.util.*;

public class basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        st.push(20);
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        st.push(30);
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        st.push(40);
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        st.push(50);
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        System.out.println("_________________________");
        st.pop();
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        System.out.println("_________________________");
        st.pop();
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
        System.out.println("_________________________");
        st.pop();
        System.out.println(st);
        System.out.println("Peek of stack : " + st.peek());
        System.out.println("Size of stack : " + st.size());
    }
}
