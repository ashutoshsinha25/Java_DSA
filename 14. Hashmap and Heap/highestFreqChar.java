// import java.io.*;
import java.util.*;

public class highestFreqChar {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        char ans = highestFrequency(s);
        System.out.println(ans);
        scn.close();
    }

    public static char highestFrequency(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch) + 1); // update
            }else{
                hm.put(ch , 1); // add
            }
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for(Character ch : hm.keySet()){
            if(maxFreq < hm.get(ch)){
                maxFreq = hm.get(ch);
                maxChar = ch;
            }
        }
        return maxChar;

    }

}