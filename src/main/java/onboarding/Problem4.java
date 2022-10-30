package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    private static Map<Character, Character> dictionary;

    public static String solution(String word) {
        dictionary = makeDictionary();
        String answer = translate(word);
        return answer;
    }

    public static Map<Character, Character> makeDictionary() {
        Map<Character, Character> dictionary = new HashMap<>();
        char alphabet = 'Z';
        for (char i = 'A'; i <= 'Z'; i++) {
            dictionary.put(i, alphabet--);
        }
        return dictionary;
    }

    public static String translate(String word) {

        return "";
    }
}
