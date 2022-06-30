import java.util.Scanner;
public class lastIdx {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();

        System.out.println(lastIndex(arr , 0 , x));
    }

    public static int lastIndex(int[]arr , int idx , int x){
        if(idx == arr.length){
            return -1;
        }
        int ans = lastIndex(arr , idx + 1 , x);
        if(ans == -1){
            if(arr[idx] == x){
                return arr[idx];
            }else{
                return -1;
            }
        }else{
            return ans;
        }
    }
}
