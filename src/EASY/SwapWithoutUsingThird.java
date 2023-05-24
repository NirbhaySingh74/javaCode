package EASY;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;
import java.util.Scanner;

public class SwapWithoutUsingThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int A = sc.nextInt();
        System.out.println("Enter B");
        int B = sc.nextInt();
        System.out.println("Before Swapping \n A "+ A + "\n B = " + B);

        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("After Swapping \n A "+ A + "\n B = " + B);
    }
}
