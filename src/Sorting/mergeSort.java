package Sorting;

import java.util.ArrayList;

public class mergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        //if elements on the left half are still left

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to all
        for(int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid); //left half
        mergeSort(arr, mid+1, high); //right half
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int arr[] = {20,10,30,25,55,40};
        int n = arr.length;
        mergeSort(arr, 0, n-1);

        for(int i = 0; i < n ; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
