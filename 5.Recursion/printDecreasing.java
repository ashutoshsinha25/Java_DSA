import java.util.Scanner;
public class printDecreasing {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      scn.close();
      printDecrease(n);
  }   


  public static void printDecrease(int n ){
      if(n == 0) return;
      System.out.println(n);
      printDecrease(n-1);
  }
}
