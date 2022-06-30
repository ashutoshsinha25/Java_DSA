import java.util.Scanner;
public class sumofArray {
    public static void main(String[] args) {
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
        int sum[] = sumArray(arr1,arr2);
        for(int val : sum){
            System.out.println(val);
        }
    }


    public static int[] sumArray(int a[] , int b[]){
        int n1 = a.length , n2 = b.length;
        int n3 = Math.max(n1,n2);
        int res[] = new int[n3];

        int p1 = n1-1 , p2 = n2-1 , p3 = n2-1 , carry = 0;
        while(p1>=0 || p2>=0){
            int first = p1 >= 0 ? a[p1] : 0;
            int second = p2 >= 0 ? b[p2] : 0;

            int out = first + second;

            if(out>9){
                int digit = out%10;
                res[p3] = digit;
                carry = out/10;
            }else{
                res[p3] = out;
            }

            p1--;
            p2--;
            p3--;
        }

        if(carry!=0){
            int newres[] = new int[n3+1];
            newres[0] = carry;
            for(int i = 1; i <= newres.length-1; i++){
                newres[i] = res[i-1];
            }
            return newres;
        }else{
            return res;
        }
    }
}
