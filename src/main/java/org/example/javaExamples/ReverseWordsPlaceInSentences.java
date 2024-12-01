package org.example.javaExamples;

public class ReverseWordsPlaceInSentences {
    /* revWords(" apple banana kiwi") => "kiwi banana apple"

     */
    public static String revWords(String str){

        StringBuilder reversedWords= new StringBuilder();
        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--) {
            // add words to reversedWords with space
            reversedWords.append(words[i] + " ");
        }

        // trim needed to remove last space in the end
        return reversedWords.toString().trim();
    }

    public static void main(String[] args) {

       String n= revWords("My Name Is Cigdem");
        System.out.println(n);
    }

    // Time Complexity: O(n)
    // Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects

    }
