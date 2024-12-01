package org.example.javaExamples;

public class StringSplitMethod {
    public static void main(String[] args) {
        String str="Merhaba, Cigdem Akbas";
        String parts []= str.split(",");
        for( String part : parts){
            System.out.println(part);
        }

    }
}
