// import java.io.*;  
import java.util.*;

public class endPointOfMatrix {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int r = 0; r < nr; r++){
            for(int c = 0; c < nc; c++){
                mat[r][c] = scn.nextInt();
            }
        }   
        scn.close();
        int dir = 0 , r = 0, c = 0;
        while(r>=0 && r < nr && c>=0 && c<nc){
            dir = (dir + mat[r][c])%4;
            if(dir == 0){
                // r = r;
                c = c+1;
            }else if(dir == 1){
                r = r+1;
                // c = c;
            }else if(dir == 2){
                // r = r;
                c = c-1;
            }else{
                r = r-1;
                // c = c;
            }
        }
        // for exit condition
        if(dir == 0){
            c = c-1;
        }else if(dir == 1){
            r = r-1;
        }else if(dir == 2){
            c = c+1;
        }else{
            r = r+1;
        }
        System.out.println(r);
        System.out.print(c);

        // int res[] = endPoint(mat,n,m);
        // for(int val: res){
        //     System.out.println(val);
        // }
    }

    // public static int[] endPoint(int mat[][],int nr,int nc){
    //     int res[] = new int[2];
    //     // int nr = mat.length-1 , nc = mat[0].length-1;
    //     int dir = 0 , r = 0, c = 0;
    //     // while((r>=0 && c>=0) && (r<mat.length && c<mat[0].length))
    //     while(r>=0 && r < nr && c>=0 && c<nc){
    //         dir = (dir + mat[r][c])%4;
    //         if(dir == 0){
    //             // r = r;
    //             c = c+1;
    //         }else if(dir == 1){
    //             r = r+1;
    //             // c = c;
    //         }else if(dir == 2){
    //             // r = r;
    //             c = c-1;
    //         }else{
    //             r = r-1;
    //             // c = c;
    //         }
    //     }
    //     // if(r<0){
    //     //     res[0] = r+1;
    //     // }else if(r>mat.length-1){
    //     //     res[0] = r-1;
    //     // }else if(c<0){
    //     //     res[1] = c+1;
    //     // }else if(c>mat[0].length-1){
    //     //     res[1] =c-1;
    //     // }
    //     if(dir == 0){
    //         c = c-1;
    //         res[1] = c;
    //     }else if(dir == 1){
    //         r = r-1;
    //         res[0] = r;
    //     }else if(dir == 2){
    //         c = c+1;
    //         res[1] = c;
    //     }else{
    //         r = r+1;
    //         res[0] =r;
    //     }
    //     return res;
    // }

}