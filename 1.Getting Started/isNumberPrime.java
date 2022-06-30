import java.util.Scanner;
public class isNumberPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        for(int i = 2 ; i*i<=n ;){
            if(n%i == 0){
                System.out.print("not a prime");
                break;
            }else{
                System.out.print("prime");
                break;
            }
        }
    }
}
