package Sorting;

public class selection {
    public static void selection(int arr[]) {
        for(int i=0; i< arr.length-1;i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }
    }

    public static void print(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[]= {3,4,5,2,1};
        selection(arr);
        print(arr);
    }
}
