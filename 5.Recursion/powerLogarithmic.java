import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();

        int ans = pLogarithmic(x , n);
        System.out.println(ans);
    }

    public static int pLogarithmic(int x , int n){
        if(n==0){
            return 1;
        }

        int rans = pLogarithmic(x, n/2);
        int ans =  rans * rans;
        if(n%2==0){
            return ans;
        }else{
            return ans * x;
        }
    }
}
