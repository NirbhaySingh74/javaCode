package pattern;

public class p_7 {

    public static void patternSeven(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int g =0;g <= n-i-1; g++){
                System.out.print(" ");
            }
            // j
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int h =0 ;h <= n-i-1; h++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternSeven(5);
    }
}
