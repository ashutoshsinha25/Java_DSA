import java.util.Scanner;
public class firstNLastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        scn.close();

        int firstIdx = firstIdx(arr , d);
        int lastIdx = lastIdx(arr , d);
        System.out.println(firstIdx);
        System.out.println(lastIdx);
    }


    public static int firstIdx(int arr[] , int d ){
        int start = 0 , end = arr.length - 1;
        int possible = 0;
        while(start<=end){
            int mid = (start + end) / 2;

            if(arr[mid]>d){
                end = mid - 1;
            }else if(arr[mid]<d){
                start = mid + 1;
            }else{
                possible = mid;
                end  = mid - 1;
            }
        }
        return possible;
    }

    public static int lastIdx(int arr[] , int d){
        int start = 0 , end = arr.length-1;
        int possible = 0;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]>d){
                end = mid - 1;
            }else if(arr[mid]<d){
                start = mid + 1;
            }else{
                possible = mid;
                start = mid + 1;
            }
        }
        return possible;
    }
}
