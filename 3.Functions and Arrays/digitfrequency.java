import java.util.Scanner;
public class digitfrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        scn.close();

        int f = getFrequency(n, d);
        System.out.print(f);
    }

    public static int getFrequency(int num , int dig){
        int count = 0;
        while(num!=0){
            int last = num%10;
            if(last == dig){
                count++;
            }
            num = num/10;
        }
        return count;
    }
}