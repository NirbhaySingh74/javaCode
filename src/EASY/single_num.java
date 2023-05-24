package EASY;

public class single_num {

    public static int unique(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
            i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,2,3};
        System.out.println(unique(arr));
    }
}
