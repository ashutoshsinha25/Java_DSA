import java.util.Scanner;
public class reverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // printing reverse of a number 
        while(n!=0){
            int last = n%10;
            System.out.println(last);
            n = n/10;
        }
        
    }
    
}
