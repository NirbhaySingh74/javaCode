package EASY;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input an Integer"); {
                n = sc.nextInt();

                if (n  == 0) {
                    break;
                }
                System.out.println("you entered " + n);
            }
        }
    }
}
