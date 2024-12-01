package org.example.javaExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseWordsInSentences {
    /*
      Create a method that reverse all the words in a sentence with existing order.
      exmaple: String sent="my name is cigdem" => " ym eman si medgic"
     */
    public static String reverseWord(String sentence) {
        String reversedS = "";
        String[] abc = sentence.split(" ");
        // first convert String to Array
        ArrayList<String> words = new ArrayList<>(Arrays.asList(abc));
        System.out.println(words);

        for (String a : words) {
            System.out.print(reversedMethod(a + " "));
        }
        System.out.println();
        return sentence;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("clarusway is the best"));
    }

    public static StringBuilder reversedMethod(String element) {
        // reverse each words
        StringBuilder sb = new StringBuilder(element);
        return sb.reverse();
    }
}
