import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int rans = fact(n-1);
        return n * rans;
    }
}
