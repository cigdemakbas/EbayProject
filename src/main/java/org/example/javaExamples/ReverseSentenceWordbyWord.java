package org.example.javaExamples;

public class ReverseSentenceWordbyWord {
    public static void main(String[] args) {
        String sentence = "Hadi bakalim bu cumleyi cevir!";
        String reversedSentence = "";
        String [] sentenceArray = sentence.split(" ");
        for (int i = sentenceArray.length-1 ; i>= 0 ; i--) {
            reversedSentence += sentenceArray[i]+ " "; }
        reversedSentence = reversedSentence.trim();
        System.out.println(reversedSentence);
    }
}
