package EASY;

public class secLargest {

     public static int seclar(int arr[]) {
         int lar = arr[0];
         int seclargest = -1;

         for(int i = 0; i < arr.length; i++) {
             if (lar < arr[i]) {
                 seclargest = lar;
                 lar = arr[i];

             } else if (arr[i] < lar && arr[i] > seclargest) {

                 seclargest = arr[i];
             }
         }
         return seclargest;
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,4,5,4,1,7,7};
         System.out.println(seclar(arr));
    }
}
