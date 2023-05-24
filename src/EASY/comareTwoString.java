package EASY;

public class comareTwoString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Hiii";
        String s3 = "hello";
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s3));
    }
}
