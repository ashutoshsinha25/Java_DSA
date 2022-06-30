import java.util.Scanner;
public class differenceofArray {
    public static void main(String[] args) {
       
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int arr1[] = new int[n1];
    for(int i = 0; i <= n1 - 1; i++){
        arr1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int arr2[] = new int[n2];
    for(int i = 0; i <= n2 - 1; i++){
        arr2[i] = scn.nextInt();
    }
    scn.close();
    
    differenceArray(arr1,arr2);
}

    public static void differenceArray(int a[] , int b[]){
        int n1 = a.length , n2 = b.length ;
        int res[] = new int[n2];
        int p1 =n1 - 1, p2 = n2 - 1, p3 = res.length - 1, carry = 0;
        while(p3>=0){
            int val = 0;
            int a1Value = p1>=0 ? a[p1] : 0;
            if(b[p2] + carry >= a1Value){
                val = (b[p2] + carry) - a1Value;
                carry = 0;
            }else{
                val = (b[p2] + carry + 10) - a1Value;
                carry = -1;
            }
            res[p3] = val;
            p1--;
            p2--;
            p3--;
        }
        
        int idx = 0;
        while(idx < res.length){
            if(res[idx] == 0){
                idx++;
            }else{
                break;
            }
        }

        while(idx<=res.length-1){
            System.out.println(res[idx]);
            idx++;
        }
    }
}
