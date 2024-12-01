package org.example.javaExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLettersWithMapY {
    public Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letters = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) + 1);
            } else {
                letters.put(ch, 1);
            }
        }
        return letters;
    }
    public static void main(String[] args) {
        CountLettersWithMapY m = new CountLettersWithMapY();
        System.out.println(m.countLetters("Cigdem"));
        System.out.println(m.countLetters("mmmnnneerth"));
    }
}
