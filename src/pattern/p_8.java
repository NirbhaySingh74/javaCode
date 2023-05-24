package pattern;

public class p_8 {

    public static void patternEight(int n){
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
      patternEight(5);
    }
}
