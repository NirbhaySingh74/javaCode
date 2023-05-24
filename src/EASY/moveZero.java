package EASY;

public class moveZero {

    public static int moveZero(int arr[]) {
        int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0) {

                break;
            } else {
                k = k + 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,0,2,3,0,4};
        System.out.println(moveZero(arr));
    }
}
