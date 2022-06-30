import java.util.Scanner;
public class findElementInArray {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i <= n-1; i++){
                arr[i] = scn.nextInt();
            }
            int d = scn.nextInt();
            scn.close();

            int idx = findEle(arr,d);
            System.out.print(idx);
        }


        public static int findEle(int arr[] , int d){
            for(int i = 0; i <= arr.length - 1; i++){
                if(arr[i] == d){
                    return i;
                }
            }
            return -1;
        }
}
