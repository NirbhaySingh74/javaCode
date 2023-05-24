package EASY;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String str2 = sc.nextLine();

        if (str1.compareTo(str2) > 0) {
            System.out.println("First String Is Greater Than Second");
        }
       else if (str1.compareTo(str2) < 0) {
            System.out.println("First String Is Smaller Than Second");
        }
       else
           System.out.println("Both Are Equal");
    }
}
