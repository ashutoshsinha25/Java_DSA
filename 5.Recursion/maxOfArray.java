import java.util.Scanner;
public class maxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(maxValue(arr , 0));
    }

    public static int maxValue(int[] arr , int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int ans = maxValue(arr , idx + 1);
        if(arr[idx] > ans){
            return arr[idx];
        }
        return ans;
    }
}
