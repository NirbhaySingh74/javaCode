package EASY;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A Is Greater");
        }
        else if(b > c) {
            System.out.println("B Is Greater");
        }
        else {
            System.out.println("C Is Greater");
        }
    }
}
