package pattern;

public class p_1 {

    public static void patternOne(int n) {
        for(int i =0;i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternOne(4);
    }
}
