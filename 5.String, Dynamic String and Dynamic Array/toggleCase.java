import java.util.*;
public class toggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
        scn.close();
		System.out.println(toggle(str));
    }

    public static String toggle(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i < sb.length() ; i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){ // lower case
                char uch = (char)('A' + ch - 'a');
                sb.setCharAt(i, uch);
            }else{ // upper case
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
}
