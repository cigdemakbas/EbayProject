package org.example.javaExamples;

import java.util.Arrays;

public class SecondMaxAndMinNumberFromANArray {
    public int secMax (int[] arr) {
        // 1. Find index of the biggest element
        int maxIndex = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        // assume that second max is the smallest possible value for int
        // it is done to make we do not get real max by different assumption
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // i not equals to maxIndex will ensure not to get the biggest element.
            if (i != maxIndex && secondMax < arr[i]) {
                secondMax = arr[i];
            }
        }

        // return second biggest
        return secondMax;

    }

    public static void main(String[] args) {
        SecondMaxAndMinNumberFromANArray d= new SecondMaxAndMinNumberFromANArray();
        int arr []= new int[]{1,3,6,8,0};
        System.out.println(d.secMax(arr));
        System.out.println(d.secMin(arr));



    }
    public int secMin(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return second element. Array is soreted from smallest to biggest
        return numArr[1];

    }

}