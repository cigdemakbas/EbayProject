package org.example.javaExamples;

public class Fibonacci {
    /* It is a series of numbers where the next number is the sum of the previous two numbers.
    The first two numbers of the Fibonacci is 0 followed by 1. Write a method that will accept one
    int number n. The method will print n number of Fibonacci numbers.

     */
    // fib(3)  -> 0 1 1
    // fib(5)  -> 0 1 1 2 3
    // fib(6)  -> 0 1 1 2 3 5
    // fib(10) -> 0 1 1 2 3 5 8 13 21 34

    public static void fib(int n) {
        int numOne = 0;
        int numTwo = 1;

        for(int i = 0; i < n; i++) {
            System.out.print(numOne + " ");

            int sum = numOne + numTwo;
            numOne = numTwo;
            numTwo = sum;
        }
}

    public static void main(String[] args) {

        fib(10);
        System.out.println();
        fib(3);
    }
}

