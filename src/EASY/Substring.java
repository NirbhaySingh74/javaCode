package EASY;
import  java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        String string, sub;
        int j, i, length;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();
        length = string.length();

        System.out.println("Substrings of \""+string+"\" are :-");
        for( i = 0 ; i < length ; i++ )
        {
            for( j = 1 ; j <= length - i ; j++ )
            {
                sub = string.substring(i, i+j);
                System.out.println(sub);
            }
            System.out.println();
        }
    }
}
