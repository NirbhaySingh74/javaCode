package EASY;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num /10;
        }
        System.out.println("Reversed Number " + reverse);
    }
}
