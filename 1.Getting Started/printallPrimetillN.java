import java.util.Scanner;
public class printallPrimetillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();
        for(int i = n1 ; i<=n2; i++){
            // check if prime
            int count = 0;
            for(int j =2 ; j*j<=i ; j++){
                if(i%j==0){
                    count++; // creating a flag like condition to be checked below.
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
