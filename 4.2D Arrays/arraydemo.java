import java.util.Scanner;
public class arraydemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nr = scn.nextInt();
        int nc = scn.nextInt();

        int mat[][] = new int[nr][nc];

        // 2d array input 
        for(int r = 0; r < nr; r++){
            for(int c = 0; c < nc; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        scn.close();

        // printing the array 
        for(int r = 0; r < nr; r++){
            for(int c = 0; c < nc; c++){
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }
    }
}

