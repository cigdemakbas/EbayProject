package org.example.javaExamples;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = scan.nextInt();
        System.out.println("Please enter number of digits");
        int digit = scan.nextInt();

        int temp = number;
        int sum = 0;
        do {
            int value = temp % 10;
            temp /= 10;
            sum += Math.pow(value, digit);
        } while (temp > 0);
        if (number == sum) {
            System.out.println("This is an Armstrong number");
        } else {
            System.out.println("This is not an Armstrong number");
        }
    }
}
