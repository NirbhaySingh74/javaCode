package EASY;

import java.util.Scanner;

public class palindrome {

    public static boolean palindrome(String str) {
       int length = str.length();
        String reverse = "";
        for (int i = length-1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
          return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println(palindrome(str));
//        int length = str.length();
//        String reverse = "";
//        for (int i = length-1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        if (str.equals(reverse)) {
//            System.out.println("It is palindrome");
//        }
//        else {
//            System.out.println("It is not a palindrome");
//        }

    }
}
