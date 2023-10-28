package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static Map<String, Integer> getWordCount(String sentence) {

        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        String[] words = sentence.split(" ");
        Map<String, Integer> hashMap = new HashMap<>();
        int value = 0;
        for (String key : words) {
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(key)) {
                    value++;
                }
            }
            hashMap.put(key, value);
            value = 0;
        }
        return hashMap;
    }
    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            stringBuilder
                    .append("  ")
                    .append(entry.getKey())
                    .append(": ")
                    .append(entry.getValue())
                    .append("\n");
        }
        return "{"
                .concat("\n")
                .concat(stringBuilder.toString())
                .concat("}");
    }
}
