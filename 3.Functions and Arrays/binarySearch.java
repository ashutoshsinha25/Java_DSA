import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();
        int val = search(arr , k);
        if (val!=-1){
            System.out.print("Element found at index: " + val);
        }else{
            System.out.print("Element not found");
        }

    }

    public static int search(int[] arr , int k ){
        int st = 0 , ed = arr.length-1;
        while(st<=ed){
            int mid = (st+ed)/2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                st = mid+1;
            }else{
                ed = mid-1;
            }
        }
        return -1;

    }
}
