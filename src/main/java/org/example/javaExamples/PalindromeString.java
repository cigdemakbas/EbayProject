package org.example.javaExamples;

public class PalindromeString {
    public static void main(String[] args) {
        String word="madam";
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.toCharArray()[i];
        }
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
