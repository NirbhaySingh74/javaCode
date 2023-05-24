package searching;

public class binary {
    public static int binarySearch(int arr[], int target) {
        int si = 0;
        int ei = arr.length;
        int mid = si + (ei - si) /2;

       while (si <= ei){
           mid = si + (ei - si) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if(target < arr[mid]) {

                ei = mid-1;
            }

       else
           si = mid + 1;
        }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }
}
