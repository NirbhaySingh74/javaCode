package EASY;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table");
        int n = sc.nextInt();
        for (int i = 1; i<= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        System.out.println("completed");
    }
}
