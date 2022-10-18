// import java.io.*;
import java.util.*;

public class spiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int r = 0; r< n; r++){
            for(int c = 0; c < m; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        scn.close();
        // logic
        int rmin = 0, rmax = n-1, cmin = 0, cmax = m-1;
        int count = 0;
        while(count < n*m){
            // left wall
            for(int r=rmin; r<=rmax && count < n*m; r++){
                System.out.println(mat[r][cmin]);
                count++;
            }
            // bottom wall
            for(int c=cmin+1; c<=cmax && count < n*m; c++){
                System.out.println(mat[rmax][c]);
                count++;
            }
            // right wall 
            for(int r=rmax-1; r>=rmin && count < n*m; r--){
                System.out.println(mat[r][cmax]);
                count++;
            }
            // top wall
            for(int c=cmax-1; c>=cmin+1 && count < n*m; c--){
                System.out.println(mat[rmin][c]);
                count++;
            }

            rmin++;
            rmax--;
            cmin++;
            cmax--;
        
        }

    }

}