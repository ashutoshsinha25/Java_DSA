import java.util.*;

public class firstIndex {
 public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++){
        arr[i] = scn.nextInt();
    }
    int k= scn.nextInt();
    scn.close();

    int out = search(arr , k);
    System.out.print("First index found at : " + out);

 }  
 public static int search(int[] arr , int k){
    int lo = 0 , hi = arr.length - 1;
    int pos = -1;
    while( lo<=hi){
        int mid = lo + (hi- lo) / 2;
        if(arr[mid] == k){
            pos = mid;
            hi = mid -1;
        }else if(arr[mid] < k){
            lo = mid + 1;
        }else{
            hi = mid - 1;
        }
    }
    return pos;


 }
}
