import java.io.*;
// import java.util.*;

public class addLast {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLastNode(int val) {
      // Write your code here
      Node n = new Node();
      n.data = val;
      if(this.size == 0){
        this.head = this.tail = n;
      }else{
        this.tail.next = n;
        this.tail = n;
      }
      this.size++;
    }
  }

  public static void testList(LinkedList list) {
    for (Node temp = list.head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
    System.out.println(list.size);

    if (list.size > 0) {
      System.out.println(list.tail.data);
    } 
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLastNode(val);
      } 
      str = br.readLine();
    }

    testList(list);
  }
}