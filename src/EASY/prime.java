package EASY;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number");
//        int n = sc.nextInt();
//        int counter = 0;
//
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0){
//              counter++;
//            }
//        }
//
//        if (counter == 2){
//            System.out.println("It is prime Number");
//        }
//        else {
//            System.out.println("It is not prime number");
//        }


        int n =5;
        for(int i = n;  i <=1; i--) {
            for(int j = 1; j >= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
