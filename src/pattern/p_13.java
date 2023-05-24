package pattern;

public class p_13 {

     public static void patternThirteen(int n ){
         int k =1;
         for (int i = 1; i <= n; i++) {
             for(int j = 1; j <= i; j++, k++) {
                 System.out.print(k +" ");
             }
             System.out.println();
         }
     }

    public static void main(String[] args) {
        patternThirteen(5);
    }
}
