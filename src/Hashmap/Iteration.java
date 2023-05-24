package Hashmap;
import java.util.*;
public class Iteration {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 10);
        hm.put("China", 15);
        hm.put("US", 5);
        hm.put("Nepal", 3);
        hm.put("Indonesia", 5);
        hm.put("Germenay", 12);

        //Iterate
        Set<String> keys = hm.keySet();
       // System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys="+ k + ",value=" + hm.get(k));
        }
    }
}
