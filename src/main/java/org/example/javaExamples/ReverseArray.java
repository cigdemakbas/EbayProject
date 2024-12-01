package org.example.javaExamples;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {1,4,5,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1 ; i >=0 ; i--) {
            System.out.print(arr[i]+",");
        }

    }
}
