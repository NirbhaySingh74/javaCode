package test;

import java.util.Scanner;

class kunal{
    kunal(String name ){
        System.out.println("your name is :- " + name);
    }
}
public class Constructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        String name = sc.nextLine();
        kunal k = new kunal(name);
    }
}
