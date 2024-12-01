package org.example.javaExamples;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(strReverse("cigdem"));
        }
        public static String strReverse(String str){
        String reverse="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse=reverse+str.toCharArray()[i];
            }
            return reverse;
        }
    }


