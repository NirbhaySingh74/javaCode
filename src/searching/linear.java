package searching;

public class linear {

    public static int linear(int arr[], int val) {
        for(int i =0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int val = 3;
        System.out.println(linear(arr,val));
    }
}
