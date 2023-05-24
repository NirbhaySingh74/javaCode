package pattern;

public class p_2 {

    public static void patternTwo(int n) {
        for(int i =0; i < n; i++) {
            for(int j = 0; j <= i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternTwo(5);
    }
}
