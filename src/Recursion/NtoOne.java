package Recursion;

public class NtoOne {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        printDec(n-1);
        System.out.print(n +" ");
    }
    public static void main(String[] args) {
        int n  = 10;
        printDec(n);
    }
}
