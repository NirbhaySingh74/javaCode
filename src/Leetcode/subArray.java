package Leetcode;

public class subArray {

    public static int subArray(int arr[]) {

         int max = Integer.MIN_VALUE;


        for(int i =0; i < arr.length; i++) {

            for(int j = i ; j < arr.length; j++) {
                int sum = 0;
                for(int k = i; k <= j ; k++){
                    //System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                    max = Math.max(sum , max);
                }

            }




        }
        return max;
    }

    public static void main(String[] args) {
     int arr[] = {1,2,3};
    System.out.println(subArray(arr));
    }
}
