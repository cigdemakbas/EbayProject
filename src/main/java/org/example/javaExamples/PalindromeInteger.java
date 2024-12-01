package org.example.javaExamples;

public class PalindromeInteger {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
            if (number == reverse) {
                return true;
            }
            return false;
        }



    public static void main(String[] args) {
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(3443));
        System.out.println(isPalindrome(345));
        System.out.println(isPalindrome(6776));
    }
}

