package Leetcode;

public class plusone {

    public static int[] plusOne(int num[]) {
        for(int i = 0; i < num.length; i++) {
            if(num[i] == num[num.length-1]){
                num[i] = num[i] + 1;
            }
            else{
                num[i] = num[i];
            }
        }
        return num;
    }
  public static void print(int num[]) {
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
  }
    public static void main(String[] args) {
        int num[] = {1,2,3,};
        plusOne(num);
        print(num);
    }
}
