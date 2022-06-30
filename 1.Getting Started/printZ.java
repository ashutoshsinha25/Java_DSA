/**
 * printx
 */

import java.util.*;
public class printZ {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int n = 5;
        scn.close();
        // System.out.print(printZ(n));
        Z(n);
        // Zprint(n);

    }

    // public static void(int n){
    //     System.out.print
    // }

    public static void Z(int n){
        for(int row = 1; row<=n ; row++){
            for(int col = 1; col<=n ; col++){
                if(row == col || row + col == n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        // return -1;
    }
}