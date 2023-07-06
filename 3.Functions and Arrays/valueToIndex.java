import java.util.*;

//test case : n = 5 , arr = [4,0,2,3,1]

public class valueToIndex {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] res = inverse(arr);
        for(int i : res) System.out.println(i);

    }

    public static int[] inverse(int[] arr){
        int[] out = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++){
            int idx = arr[i];
            out[idx] = i;
        }
        return out;
    }
}
