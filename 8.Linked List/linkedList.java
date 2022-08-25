public class linkedList{
    // public static class Person{
    //     String name;
    //     int age;
    // }


    public static class Node{
        int data;
        Node next;

    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int data){
            Node n = new Node();
            n.data = data;

            if(size == 0){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
            size++;
        } 
    }
    public static void main(String[] args) {
        // Person p1 = new Person();
        // System.out.println(p1.name + " " + p1.age);
        // p1.name = "Ashutosh";
        // p1.age = 20;
        // System.out.print(p1.name + " " + p1.age);

        LinkedList ll = new LinkedList();
        System.out.println(ll.head + " " +  ll.tail + " " + ll.size);
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println(ll.head.data + " " + ll.tail.data + " " + ll.size);



    }
}