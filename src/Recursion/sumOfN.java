package Recursion;

public class sumOfN {
    public static int sumOfN(int n ) {
        if (n == 1) {
            return 1;
        }

        int sum = n + sumOfN(n - 1);
        return sum;
    }

    public static void main(String[] args) {
       System.out.println( sumOfN(5));
    }
}
