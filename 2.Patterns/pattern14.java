import java.util.Scanner;
public class pattern14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        for(int i = 1; i <= 10; i++){
            int out = i * n;
            System.out.println(n + " " + "*" + " " + i + " = " + out);
        }
    
    }

}
