package exercise;

import java.util.*;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] inputValue) {
        String[][] items = Arrays.stream(inputValue)
                .map(App::duplicateValues)
                .toArray(String[][]::new);
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(String[][]::new);

    }
    public static String[] duplicateValues(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }
}
// END
