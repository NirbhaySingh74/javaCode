package Leetcode;

import javax.swing.plaf.PanelUI;
import java.util.HashMap;
import java.util.Map;

public class romanToInt {

    public static int roman(String s) {
        //map to store roman numerals
        Map<Character,Integer> romanMap = new HashMap<>();
        //Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        //Length Of the given string
        int n = s.length();
        //variable to store result
        int num = romanMap.get(s.charAt(n-1));
        for (int i = n - 2; i >= 0; i--) {
            // Check if the character at right of current character is
            // bigger or smaller
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }




        return num;
    }


    public static void main(String[] args) {
        String s = "IIII";
        System.out.println(roman(s));
    }
}

