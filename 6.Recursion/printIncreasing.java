import java.util.Scanner;
public class printIncreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        printIncrease(n);
    }


    public static void printIncrease(int n){
        if(n == 0){ //  base case
            // System.out.println(n);
            return;
        }
        printIncrease(n-1); // faith
        System.out.println(n); // my work
        return;
    }
}