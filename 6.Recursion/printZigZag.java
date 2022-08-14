import java.util.Scanner;
public class printZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        zigzag(n);
    }

    public static void zigzag(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
        zigzag(n-1);
        System.out.println(n);
    }
}
