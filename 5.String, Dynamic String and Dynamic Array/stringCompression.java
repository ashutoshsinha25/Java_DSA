import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        System.out.println(compression1(s));
        System.out.println(compression2(s)); 
    }

    public static String compression1(String s){
        String output = s.substring(0,1);
        //String output = s.charAt(0) + "";
       
        for(int i = 1; i < s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr != prev){
                output += curr;
            }
        }
        return output;
    }
    public static String compression2(String s){
        int count = 1;
        String output = s.substring(0,1);
        for(int i = 1; i < s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if(curr == prev){
                count++;
            }else{
                if(count> 1){
                    output += count;
                    count = 1;
                }
                output += curr;
            }
        }

        if(count > 1){
            output += count;
        }
        return output;
    }
}
