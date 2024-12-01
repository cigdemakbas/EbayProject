package org.example.javaExamples;

public class PrintEvensFromAnArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        evenFromArray(a);
    }

    public static void evenFromArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" "+arr[i]);
            }
        }
    }
}