// import java.io.*;
import java.util.*;

public class ringRotate {

    public static void main(String[] args) throws Exception {
        // input 
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc= scn.nextInt();
        int mat[][] = new int[nr][nc];
        for(int r=0; r<nr; r++){
            for(int c=0; c<nc; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        int shellNo = scn.nextInt();
        int k = scn.nextInt();
        scn.close();
        rotate(mat, shellNo, k);
        display(mat);
    }
    public static int[] fill1d(int mat[][] , int shell){
        int nr = mat.length , nc = mat[0].length ;
        int rmin = shell - 1;
        int cmin = shell - 1;
        int rmax = nr - shell;
        int cmax = nc - shell;
        ArrayList<Integer> list = new ArrayList<>();
        // left wall
        for(int r=rmin; r<=rmax ; r++){
            list.add(mat[r][cmin]);
        }
        // bottom wall
        for(int c=cmin+1; c<=cmax ; c++){
            list.add(mat[rmax][c]);
        }
        // right wall 
        for(int r=rmax-1; r>=rmin ; r--){
            list.add(mat[r][cmax]);
        }
        // top wall
        for(int c=cmax-1; c>=cmin+1 ; c--){
            list.add(mat[rmin][c]);
        }
        // one way to convert array llist to array
        int size = list.size() ;
        int arr[] = new int[size];
        for(int i =0; i < arr.length ; i++){
            arr[i] = list.get(i);
        } 

        return arr;

        // another way of java direct 
        // return list.toArray(new int[list.length]);
        

    }
    public static void fill2d(int mat[][] , int shell , int arr[]){
        int nr = mat.length , nc = mat[0].length ;
        int rmin = shell - 1;
        int cmin = shell - 1;
        int rmax = nr - shell;
        int cmax = nc - shell;
        int idx = 0;
        // left wall
        for(int r=rmin; r<=rmax ; r++){
            mat[r][cmin] = arr[idx];
            idx++;
        }
        // bottom wall
        for(int c=cmin+1; c<=cmax ; c++){
            mat[rmax][c] = arr[idx];
            idx++;
        }
        // right wall 
        for(int r=rmax-1; r>=rmin ; r--){
            mat[r][cmax] = arr[idx];
            idx++;
        }
        // top wall
        for(int c=cmax-1; c>=cmin+1 ; c--){
            mat[rmin][c] = arr[idx];
            idx++;
        }  
    }
    public static void reverse(int[] a, int li, int ri){
        while(li < ri){
        int temp = a[li];
        a[li]= a[ri];
        a[ri] = temp;
 
        li++;
        ri--;
        }
    }
    public static void rotate(int[] a, int k){
        k = k % a.length;
        if(k < 0){
        k += a.length;
        }
        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }
    
    public static void rotate(int mat[][], int shell, int k){
        // 2d array to 1d array fill
        int arr[] = fill1d(mat , shell);
        // rotate 1d darray
        rotate(arr , k);
        // 1d array to 2d array fill
        fill2d(mat , shell , arr);
    
    }  

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}