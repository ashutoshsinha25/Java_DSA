import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=n ; col++){
                if(row == col){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
