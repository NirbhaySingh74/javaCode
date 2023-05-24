package pattern;

public class p_9 {
    public static void patternNine(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j<= n - i - 1; j++) {
                System.out.print(" ");
            }
            // j
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
        public static void patternNinee(int n){
        //i
        for (int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2*n - (2*i+ 1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternNine(5);
        patternNinee(5);
    }
}
