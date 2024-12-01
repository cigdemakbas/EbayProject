package org.example.javaExamples;

public class PrimeNumbers {
    public boolean isPrime(int number){
        for (int i = 2; i <number ; i++) {
            if(number%i==0) {
                return false;
            }
             }
            return true;

        }

    public static void main(String[] args) {
        PrimeNumbers m= new PrimeNumbers();
        System.out.println(m.isPrime(1));
        System.out.println(m.isPrime(4));
        System.out.println(m.isPrime(7));
    }
    }

