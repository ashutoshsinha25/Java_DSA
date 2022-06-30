import java.util.Scanner;
public class countDigitInaNumber {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int count = 0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.print(count);
    }
}
