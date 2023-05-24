package Recursion;

public class firstOccurence {
    public static int firstOccu(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccu(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,3,7,6,5};
        int key = 5;
        System.out.println(firstOccu(arr,15,0));
    }
}
