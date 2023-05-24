package EASY;

import java.util.Scanner;

public class FahrenToCelc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Farengeight = sc.nextFloat();
        float celcius;
        celcius = ((Farengeight - 32) *5) / 9;
        System.out.println(celcius);
    }
}
