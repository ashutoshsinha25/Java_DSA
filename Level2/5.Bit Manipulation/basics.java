public class basics {
    public static void main(String[] args) {
        int n1 = 5; // binary : 101
        int n2 = 3; // binary : 011
        System.out.println("bitwise OR : " + (n1 | n2)); // ans 7 : 111 
        System.out.println("bitwise AND : " + (n1 & n2)); // ans 1 : 001
        System.out.println("bitwise XOR : " + (n1 ^  n2)); // ans 6 : 110
        System.out.println("bitwise negation : " + (~n1)); // ans -6
    }
}
