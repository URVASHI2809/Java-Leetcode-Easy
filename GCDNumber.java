// write a program of greatest common divisor of two numbers in java using user input

//Enter two values: 81 12
//GCD number: 3

import java.util.Scanner;

public class GCDNumber {
    public static void GCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two values: ");
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        while (divident % divisor != 0) {
            int remainder = divident % divisor;
            divident = divisor;
            divisor = remainder;
        }
        System.out.print("GCD number: " + divisor);
    }

    public static void main(String[] args) {
        GCD();
    }
}
