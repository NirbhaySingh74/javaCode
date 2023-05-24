package Sorting;

public class bubble {

    public static void bubblesort(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,4,2,7,9};
        bubblesort(arr);
        print(arr);
    }
}
