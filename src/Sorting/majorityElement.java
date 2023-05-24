package Sorting;

public class majorityElement {

    public static int majority(int arr[]) {

        int len = arr.length / 2;

        for(int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    cnt++;
                }
            }
            if(cnt >= len){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,2,3,1,3,2,3,2,2,2,2};
        System.out.println(majority(arr));
    }
}
