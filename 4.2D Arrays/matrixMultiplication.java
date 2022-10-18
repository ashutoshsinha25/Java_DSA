// import java.io.*;
import java.util.*;

public class matrixMultiplication{


public static void input(int arr[][] , Scanner scn){

    for(int i = 0; i < arr.length ; i++){
        for(int j = 0; j < arr[0].length; j++){
            arr[i][j] = scn.nextInt();
        }
    }
}

public static void display(int arr[][]){
    for(int i = 0 ;i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int arr1[][] = new int[n1][m1];
    input(arr1 , scn);
    

    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int arr2[][] = new int[n2][m2];
    input(arr2,scn);
    
    int res[][] = multiply(arr1,arr2);
    if(res!=null){
        display(res);
    }
 }
 public static int[][] multiply(int arr1[][] , int arr2[][]){
     int res[][] = null;
     int nr1 = arr1.length , nc1 = arr1[0].length;
     int nr2 = arr2.length , nc2 = arr2[0].length;
     if(nc1 == nr2){
        // multiplication possible
        res = new int[nr1][nc2];

        for(int i = 0; i < res.length ; i++){
            for(int j = 0; j < res[0].length; j++){
                for(int k = 0; k < nc1 ; k++){
                    res[i][j] = res[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return res;
     }else{
         System.out.print("Invalid input");
     }
    return res;
 }
 public static int[][] matrixMultiply(int mat1[][],int mat2[][]){
        int nr1 = mat1.length , nc1 = mat1[0].length;
        int nr2 = mat2.length , nc2 = mat2[0].length;
        
        int res[][] = null;
        if(nc1 == nr2){
            // matrix multiplication is possible
            res = new int[nr1][nc2];

            for(int r = 0 ; r < res.length ; r++){
                for(int c = 0 ; c < res[0].length ; c++){

                    for(int k = 0 ; k < nc1 ; k++){
                        res[r][c] = res[r][c] + (mat1[r][k] * mat2[k][c]);
                    }

                }
            }

            return res;
        }else{
            System.out.println("Invalid input");
        }
        return res;
    }

}