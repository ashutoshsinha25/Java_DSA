import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int nstar = 1 , nspace = n/2;
        for(int row = 1; row<=n ; row++){

            //space 
            for(int i = 1 ; i<=nspace ; i++){
                System.out.print('\t');
            }
            // star
            for(int i = 1; i<= nstar ; i++){
                if(i==1 || i==nstar){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            if(row<=n/2){
                nstar = nstar + 2;
                nspace = nspace - 1;
            }else{
                nstar = nstar - 2;
                nspace = nspace + 1;
            }
        }
    }
}
