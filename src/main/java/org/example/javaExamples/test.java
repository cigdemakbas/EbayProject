package org.example.javaExamples;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        System.out.println(countLetters("cciigdeem"));
    }
    public static Map<Character,Integer> countLetters(String str){
        Map<Character,Integer> letters= new HashMap<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch= str.charAt(i);

            if(letters.containsKey(ch)){
                letters.put(ch,letters.get(ch)+1);
            } else letters.put(ch,1);
        }
        return letters;
    }
}
