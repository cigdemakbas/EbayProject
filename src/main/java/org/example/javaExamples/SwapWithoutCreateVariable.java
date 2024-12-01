package org.example.javaExamples;

public class SwapWithoutCreateVariable {
    public static void main(String[] args) {

        int j = 15;
        int i = 10;


        // TODO swap values of i and j without creating any variables

        j = j - i; // j = 15 - 10; j = 5
        i = i + j; // i = 10 + 5;  i = 15
        j = i - j; // j = 15 - 5;  j = 10

        System.out.println(i); // 15
        System.out.println(j); // 10
    }
}