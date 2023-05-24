package pattern;

public class P_3 {

    public static void patternThree(int n) {
        for(int i = 1; i <= n ; i++) {
            for (int j = 1 ;j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       patternThree(5);
    }
}
