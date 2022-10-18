// import java.io.*;
import java.util.*;

public class stateOfWakanda1{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int nr = scn.nextInt();
    int nc = scn.nextInt();
    int mat[][] = new int[nr][nc];
    for(int r=0; r<nr; r++){
        for(int c=0; c<nc; c++){
            mat[r][c] = scn.nextInt();
        }
    }
    scn.close();


    int rmin = 0 , rmax = mat.length-1 , cmin = 0, cmax = mat[0].length-1;
    int count = 0;
    while(cmin<=cmax){
        // top to bottom 
        for(int r = rmin ; r <= rmax && count<nr*nc; r++){
            System.out.println(mat[r][cmin]);
            count++;
        }
        cmin++;
        // bottom to top
        for(int r = rmax ; r >= rmin && count<nr*nc; r--){
            System.out.println(mat[r][cmin]);
            count++;
        }
        cmin++;
    }
 }

}