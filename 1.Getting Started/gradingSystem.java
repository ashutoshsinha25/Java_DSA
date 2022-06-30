import java.util.Scanner;
public class gradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        if(n>90){
            System.out.print("excellent");
        }else if(n>80){
            System.out.print("good");
        }else if(n>70){
            System.out.print("fair");
        }else if(n>60){
            System.out.print("meets expectations");
        }else{
            System.out.print("below par");
        }
    }
}
