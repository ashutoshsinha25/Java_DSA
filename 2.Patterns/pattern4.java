import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int nstar = n;
        int nspace = n - nstar;
        // row 
        for(int i = 1; i<=n; i++){
            // space
            
            for(int j = 1; j<=nspace; j++){
                System.out.print(" \t");
            }

            // star
            for(int j = 1; j<=nstar ; j++){
                System.out.print("*\t");
            }
            System.out.println();
            nstar--;
            nspace++;
        
        }
    }
}
