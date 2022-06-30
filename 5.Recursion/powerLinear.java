import java.util.Scanner;
public class powerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = pLinear(x , n);
        scn.close();
        System.out.println(ans);
    }

    public static int pLinear( int x , int n){
        if(n==0){
            return 1;
        }
        int ans = pLinear(x , n-1);
        return x * ans;
    }
}
