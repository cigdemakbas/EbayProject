package org.example.javaExamples;

public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd m= new EvenOrOdd();
        m.evenOrOdd(12);
        m.evenOrOdd(3);
    }
    public void evenOrOdd(int a){
        if(a%2==0){
            System.out.println("even");
        } else if (a%2==1) {
            System.out.println("odd");

        }
    }

    public static class Factorial {
        public static void main(String[] args) {

            int number = 4;
            int factorialSum = 1;
            for (int i = 1; i <=number ; i++) {
                factorialSum=factorialSum*i;
            }
            System.out.println("Factorial of "+number+" is "+factorialSum);
        }
    }
}
