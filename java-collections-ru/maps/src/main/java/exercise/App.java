package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static Map<String, Integer> getWordCount(String sentence) {

        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        List<String> words = new ArrayList<>(List.of(sentence.split(" ")));
        Map<String, Integer> keys = new HashMap<>();
        int value = 1;
        for (String key : words) {
            if (!keys.containsKey(key)) {
                keys.put(key, value);
            } else {
                keys.put(key, keys.get(key) + value);
            }
        }
        return keys;
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
