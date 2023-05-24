package pattern;

public class p_4 {

     public static void patternFour(int n){
         for (int i = 1; i <= n; i++){
             for (int j = 1; j <= i; j++){
                 System.out.print(i+" ");
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {
        patternFour(5);
    }
}
