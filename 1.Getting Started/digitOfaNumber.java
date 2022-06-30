import java.util.Scanner;
public class digitOfaNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        // calculating the value to be used to divide the number 
        int copy = n;
        int temp = 1;
        while(copy>9){
            temp = temp*10;
            copy = copy/10;
        }

        // printing the number 
        while(temp!=0){// we use temp as if we use n the for numbers such as 1000 , it will ignore 0 and would only print 1. so we use temp 
            int first = n/temp;
            System.out.println(first);
            n = n%temp;
            temp = temp/10;
        }
    }
}
