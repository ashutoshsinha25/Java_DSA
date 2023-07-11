import java.util.*;
public class rotateArray {
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n ; i++){
        arr[i] = scn.nextInt();
    }
    scn.close();

    int[] res = rotate(arr);
    for(int i : res){
        System.out.print(i + " ");
    }
 }  
 
 public static int[] rotate(int[] arr){
    return new int[]{0};
 }


 public static int[] reverse(int[] arr){
    int low = 0 , high = arr.length - 1;
    while(low < high){
        int temp = arr[low];
        arr[low]= arr[high];
        arr[high] = temp;
    }
    return arr;
 }
}
