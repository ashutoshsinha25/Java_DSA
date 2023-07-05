import java.util.*;


/**
 * add
 */
public class add {

    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        scn.close();
        int val = add2(num1, num2);
        add1(num1,num2);
        System.out.print(val);


    }
    public static void add1(int n1 , int n2){
        int ans = n1 + n2;
        System.out.println(ans);
    }
    public static int add2(int n1 , int n2){
        int ans = n1 + n2;
        return ans;
    }
}