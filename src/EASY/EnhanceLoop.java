package EASY;

public class EnhanceLoop {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        String lang[] = {"C", "C++", "Java","Python","JavaScript"};
        for(int i : arr){
            System.out.println(i);
        }

        for(String sample: lang) {
            System.out.println(sample);
        }
    }
}
