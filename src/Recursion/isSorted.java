package Recursion;

public class isSorted {

     public static boolean isSort(int arr[], int i) {
         if (i == arr.length-1) {
             return true;
         }
         if(arr[i] > arr[i+1]){
             return false;
         }
        return isSort(arr,i+1);
     }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
       int i = 0;
       System.out.println(isSort(arr,i));
    }
}
