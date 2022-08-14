import java.util.*;
public class printAllPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        printPalindromicStrings(s);

    }
    public static void printPalindromicStrings(String str){

        for(int i =0 ; i < str.length() ; i++){
            for (int j = i+1 ; j <= str.length() ; j++ ){
                String ss = str.substring(i , j);
                if(isPalindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        int start = 0 , end = str.length() - 1;

        while(start <= end){
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);
            if(ch1 != ch2){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
