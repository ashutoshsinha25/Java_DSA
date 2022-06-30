import java.util.Scanner;
public class pattern16 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int nstar = 1 , nspace = 2*n-3;
        for(int row = 1; row <= n; row++){
            // star 
            for(int i = 1; i <= nstar; i++){
                System.out.print("*\t");
            }
            // space 
            for(int i = 1; i <= nspace; i++){
                System.out.print("\t");
            }
            // star
            if(row == n){
                nstar--;
            }
            for(int i = 1; i <= nstar; i++){
                System.out.print("*\t");
            }
            System.out.println();
            // row++;
            nstar++;
            nspace-=2;
        }

    }
}