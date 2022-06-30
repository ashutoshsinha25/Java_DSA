import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int row = 1, nstar = n/2 + 1 , nspace = 1;
        while(row<=n){
            // star
            for(int i = 1; i<=nstar ; i++){
                System.out.print("*\t");
            }
            // space
            for(int i = 1; i<=nspace ; i++){
                System.out.print("\t");
            }
            // star
            for(int i =1; i<=nstar ; i++){
                System.out.print("*\t");
            }
            System.out.println();
            if(row<=n/2){
                nstar = nstar - 1;
                nspace = nspace + 2;
            }else{
                nstar = nstar + 1;
                nspace = nspace - 2;
            }
            row++;
        }
    }
}
