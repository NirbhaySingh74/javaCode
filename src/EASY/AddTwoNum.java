package EASY;

import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B = sc.nextInt();
        int sum = A + B;
        System.out.println("SUM = " + sum);
    }
}
