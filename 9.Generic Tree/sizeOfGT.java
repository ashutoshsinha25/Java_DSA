import java.util.*;

public class sizeOfGT {
    private static class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data = data;
            children = new ArrayList<>();
        }
    }

    public static Node construct(Integer[] arr){
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);

        int idx = 1;
        while(idx < arr.length){
            Integer val = arr[idx];
            if(val == null){
                st.pop();
            }else{
                Node n = new Node(arr[idx]);
                Node parent = st.peek();
                parent.children.add(n);
                st.push(n);
            }
            idx++;
        }
        return root;
        
    }

    public static void display(Node n){
        System.out.print(n.data + " --->");
        for(Node child : n.children){
            System.out.print(child.data + ' ');
        }
        System.out.println(".");

        for(Node child : n.children){
            display(child);
        }
    }

    public static int size(Node root){
        int count = 0;

        for(Node child : root.children){
            count += size(child);
        }
        count+=1;

        return count;
    }
    
    public static void main(String[] args) {
        Integer []arr = {10, 20, 50, null, 60, null, null, 30, 70, 90, null, 100, null, 110, null, null, null, 40, 80, null, null, null};
        Node root = construct(arr);
        // display(root);
        System.out.println(size(root));
    }
}
