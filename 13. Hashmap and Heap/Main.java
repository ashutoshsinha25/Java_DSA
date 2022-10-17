import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();
        // add elements
        hm.put("India" , 135);
        hm.put("China" , 200);
        hm.put("Pak" , 30);
        hm.put("US" , 20);
        hm.put("UK" , 10);
        System.out.println(hm);
        // update elements
        hm.put("US" , 25);
        // get elements
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Utopia"));
        // check elements
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Utopia"));
        // all keys 
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        //remove key , value 
        System.out.println(hm.remove("India") + " status --> " + hm);
        System.out.println(hm.remove("India") + " status --> " + hm);

    }
}
