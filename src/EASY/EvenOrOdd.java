package EASY;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        if (x %2 == 0) {
            System.out.println("No Is Even");
        }
        else {
            System.out.println("No Is Odd");
        }
    }
}
