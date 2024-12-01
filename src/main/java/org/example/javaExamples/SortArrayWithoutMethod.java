package org.example.javaExamples;

import java.util.Arrays;

public class SortArrayWithoutMethod {
    public static void main(String[] args) {
        int[] arrNum = {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        sSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]

        arrNum = new int [] {6, 5, 2, 1, 9, 10, 0};
        System.out.println(Arrays.toString(arrNum)); // [6, 5, 2, 1, 9, 10, 0]
        bSort(arrNum);
        System.out.println(Arrays.toString(arrNum)); // [0, 1, 2, 5, 6, 9, 10]

    }

    /**
     * Selection Sort
     * The main idea to keep finding the smallest element and put it the beginning of array.
     */
    public static void sSort(int[] arr) {
        // loop over each element of array
        for (int i = 0; i < arr.length; i++) {
            int mIndex = i;
            int min = arr[i];

            // find smallest index
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    mIndex = j;
                }
            }

            // swap the values of i and smallest element.
            int tmp = arr[i];
            arr[i] = arr[mIndex];
            arr[mIndex] = tmp;
        }
    }

    /**
     * Bubble Sort
     * In bubble sort we push the biggest elements to the end of array by switching pairs of elements
     * if they are not in correct order.
     */
    public static void bSort(int[] arr) {
        // set swapCounter to a non-zero value
        int swapCounter = -1;

        // repeat till the swap counter is not 0
        while (swapCounter != 0) {
            // reset swapCounter to 0
            swapCounter = 0;

            // Look at each adjacent pair
            for (int i = 0; i < arr.length - 1; i++) {
                // if two elements are not sorted swap them and add one to swapCounter
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapCounter++;
                }
            }
        }
    }
}

