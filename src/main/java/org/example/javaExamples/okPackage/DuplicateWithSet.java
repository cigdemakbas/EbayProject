package org.example.javaExamples.okPackage;

import java.util.LinkedHashSet;

public class DuplicateWithSet {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 2, 3, 4};
        removeDup(arr);

    }

    public static void removeDup(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);


}}