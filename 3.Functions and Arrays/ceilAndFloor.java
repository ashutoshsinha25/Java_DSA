import java.util.*;


public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        scn.close();
        search(arr , k);
    }

    public static void search(int[] arr , int k){
        int st = 0 ,ed = arr.length-1;
        int floor = -1, ceil = -1;
        while(st<=ed){
            int mid = (st + ed) / 2;
            if(arr[mid] == k){
                System.out.print("Element found : " + arr[mid]); 
                return;
            }else if(arr[mid] < k){
                st = mid+1;
                floor = arr[mid];
            }else{
                ed = mid-1;
                ceil = arr[mid];
            }
        }
        System.out.println("Floor value : " + floor);
        System.out.print("Ceil value : " + ceil);

    }
}
