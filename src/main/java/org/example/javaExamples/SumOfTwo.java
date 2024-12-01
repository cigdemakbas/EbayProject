package org.example.javaExamples;

import java.util.Arrays;

public class SumOfTwo {
    /* Write a method that accepts int[] array and an int number, find 2 elements in the array that
    sum is equal to the given int. Assume that an input array will have only one pair of numbers that
     sum equal to our given number.
     It will always have this pair. See input and output examples. I use the Brute Force algorithm.
     */
    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}

    public int[] sum(int numArr[], int num) {
        int[] sumNumbers = new int[2];

        for(int i = 0; i < numArr.length; i++) {
            for(int j = i + 1; j < numArr.length; j++) {
                if(numArr[i] + numArr[j] == num) {
                    sumNumbers[0] = numArr[i];
                    sumNumbers[1] = numArr[j];
                }
            }
        }

        return sumNumbers;
    }

    public static void main(String[] args) {
        SumOfTwo m= new SumOfTwo();
        int arr[]= new int[]{2,3,4,1};

        System.out.println(Arrays.toString(m.sum(arr,7)));
    }
}
