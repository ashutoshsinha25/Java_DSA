import java.util.Scanner;
public class spanofArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        int span = getSpan(arr);
        System.out.print(span);
    }

    public static int getSpan(int arr[]){
        int min = arr[0] , max = arr[0];

        // for getting the max 

        for(int i = 0; i <= arr.length - 1; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        int out = max - min;
        return out;
    }
}
