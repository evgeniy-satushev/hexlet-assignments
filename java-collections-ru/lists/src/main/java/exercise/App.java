package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        if (letters.isEmpty()) {
            return false;
        }
        String[] temp = letters.toLowerCase().split("");
        String[] words = word.toLowerCase().split("");
        List<String> symbols = new ArrayList<>(Arrays.asList(temp)); //List.of(temp)
        for (String symbol : words) {
            symbols.remove(symbol);
        }
        int diff = letters.length() - symbols.size();
        return diff == word.length();
    }
}
//END
