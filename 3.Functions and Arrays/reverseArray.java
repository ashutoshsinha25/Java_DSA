import java.util.*;
public class reverseArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        int[] out = reverse(arr);
        System.out.println("Original Array");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Reversed Array");
        for(int i : out){
            System.out.print(i + " ");
        }  
        System.out.println();
        System.out.print("Inplace function :");
        System.out.println();
        reverseInplace(arr);
    }

    public static int[] reverse(int[] arr){
        int[] out = new int[arr.length];
        int idx = arr.length - 1;
        for(int i = 0 ; i < out.length ; i++){
            out[i] = arr[idx];
            idx--;
        }
        return out;
    }


    public static void reverseInplace(int[] arr){
        int l = 0 , r = arr.length - 1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    


}
