// import java.io.*;
import java.util.*;

public class getCommonEle{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i < n1; i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int i = 0; i < n2; i++){
        arr2[i] = scn.nextInt();
    }
    scn.close();
    printCommon(arr1 , arr2);
 }
 public static void printCommon(int[] arr1 , int[] arr2){
    HashMap<Integer , Integer> hm = new HashMap<>();
    for(int i : arr1){
        if(hm.containsKey(i)){
            hm.put(i , hm.get(i) + 1);
        }else{
            hm.put(i , 1);
        }
    }

    for(int i : arr2){
        if(hm.get(i) != null){
            System.out.println(i);
            hm.remove(i);
        }
    }
 }

}