package Hashmap;

import java.util.*;
public class basics {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 10);

        //print
        System.out.println(hm);

        //Get
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        //ContainsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
