import java.util.*;

public class getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        scn.close();
        System.out.println(gss(s));

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char first = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = gss(ros);
        ArrayList<String> myList = new ArrayList<>();

        for(String ch : rres){
            myList.add(ch);
        }
        for(String ch : rres){
            myList.add(first + ch);
        }
        return myList;
    }

}