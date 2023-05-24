package EASY;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class SwapTwoNumWithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Before Swapping\na = "+a+"\nb = "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap A = " + a);
        System.out.println("After Swap B = " + b);
    }
}
