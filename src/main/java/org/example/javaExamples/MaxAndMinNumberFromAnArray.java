package org.example.javaExamples;

public class MaxAndMinNumberFromAnArray {
    public int max(int[] arrNum){
        int max= arrNum[0];
        for (int i = 0; i < arrNum.length; i++) {
            if(max<arrNum[i]){
                max=arrNum[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxAndMinNumberFromAnArray m= new MaxAndMinNumberFromAnArray();
        int [] a= new int[] {3,5,67,2};
        System.out.println(m.max(a));
        MaxAndMinNumberFromAnArray k= new MaxAndMinNumberFromAnArray();
        System.out.println(k.min(a));


    }
    public int min(int[] arrNum) {
        // assume first element of array is the smallest number
        int min = arrNum[0];

        // loop over the array and test assumption
        for(int i = 0; i < arrNum.length; i++) {
            // if min was not smallest, update it
            if(min > arrNum[i]) {
                min = arrNum[i];
            }
        }

        return min;
    }

}
