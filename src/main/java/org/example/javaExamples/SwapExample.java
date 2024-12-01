package org.example.javaExamples;

public class SwapExample {
    // Swapping 2 integer
    public static void main(String[] args) {
        int x=10;
        int y=20;

        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping : x= "+x+" y= "+y);
    }
}
