import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        // rows
        int temp = n;
        for(int i = 1; i<=n; i++){
            //star
            for(int j = 1; j<=temp ; j++){
                System.out.print("*\t");
            }
            temp--;
            System.out.println();

        }
    }
}
