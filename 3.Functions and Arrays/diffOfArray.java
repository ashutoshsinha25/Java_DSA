import java.util.*;

public class diffOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0 ; i < n1 ; i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0 ; i < n2 ; i++){
            arr2[i] = scn.nextInt();
        }
        scn.close();

        int[] out = diff(arr1 , arr2 );

    }

    public static int[] diff(int[] arr1 , int[]  arr2){
        int p1 = arr1.length - 1 , p2 = arr2.length - 1;
        int[] n = new int[arr2.length];
        int p3 = n.length - 1;
        int borrow = 0;
        while(p1 >= 0 ||p2 >= 0){
            


        }
        return n;
    }
}
