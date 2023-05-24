package EASY;

public class secSmallest {

     public static int secSmallest(int arr[]){
         int smallest = arr[0];
         int secSmall = Integer.MAX_VALUE;

         for(int i = 1; i < arr.length; i++) {
             if(arr[i] < smallest) {
                 secSmall = smallest;
                 smallest = arr[i];
             } else if (arr[i] != smallest && arr[i] < secSmall) {
                 secSmall = arr[i];
             }
         }
         return secSmall;
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(secSmallest(arr));
    }
}
