import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // row
        for(int i = 1; i<=n; i++){
            // space
            int nstar = i;
            int nspace = n-nstar;

            for(int j = 1; j<=nspace ;j++){
                System.out.print("\t");
            }

            // star
            for(int j = 1; j<=nstar ;j++){
                System.out.print("*\t");
            }
            // nstar++;
            System.out.println();
        }
    }
}
