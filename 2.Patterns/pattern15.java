import java.util.Scanner;
public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int nstar = 1 , nspace = n/2 , num = 1;
        for(int row = 1; row <= n; row++){
            // space 
            for(int i = 1; i<= nspace; i++){
                System.out.print("\t");
            }

            // star 
            int temp = num;
            for(int i = 1; i <= nstar; i++){
                System.out.print(temp + "\t");
                if(i<=nstar/2){
                    temp = temp + 1;
                }else{
                    temp = temp - 1;
                }
            }
            System.out.println();
            if(row<=n/2){
                nstar = nstar + 2;
                nspace = nspace - 1;
                num++;
            }else{
                nstar = nstar - 2;
                nspace = nspace + 1;
                num--;
            }
        }
    }
}
