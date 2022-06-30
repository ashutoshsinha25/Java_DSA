import java.util.Scanner;
public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int idx1 = 1 , idx2 = 2 , idx3 = 3;
        scn.close();
        toh(n , idx1 , idx2 , idx3);
    }


    public static void toh(int n , int idx1 , int idx2 , int idx3){
        if(n == 0){
            return;
        }

        toh(n-1 , idx1 , idx3 , idx2);
        System.out.println(n + "[" + idx1 + " --> " + idx2 + ']' );
        toh(n-1 , idx3 , idx2 , idx1);

    }
}
