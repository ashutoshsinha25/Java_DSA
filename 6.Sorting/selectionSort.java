// import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for(int i : arr){
        //     arr[i] = scn.nextInt();
        // }
        // scn.close();
        int[] arr = {7,6,3,9,1,5};
        selectionsort(arr);
        System.out.println(arr);
    }

    public static void selectionsort(int[] nums){
        // selection sort 
        for(int i = 0 ; i < nums.length ; i++){
            int minIdx = i;
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[minIdx] > nums[j]){
                    minIdx = j;
                }
            }
            swap(nums, minIdx , i);
        }
    }
    public static void swap(int[] nums , int i , int j ){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
