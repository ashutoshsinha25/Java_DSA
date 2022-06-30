import java.util.Scanner;
public class finbonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int n1 = 0 , n2 = 1;
        int count = 0;
        while(count!=n){
            int n3 = n1 + n2;
            System.out.println(n1);
            count++;

            n1 = n2;
            n2 = n3;
        }
    }
}
