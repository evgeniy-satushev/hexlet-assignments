package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Map<String, Object> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        Set<String> temp = new HashSet<>(firstMap.keySet());
        temp.addAll(secondMap.keySet());
        return temp.stream()
                .collect(Collectors.toMap(key -> key, value -> {
            if (!firstMap.containsKey(value)) {
                return "added";
            } else if (!secondMap.containsKey(value)) {
                return "deleted";
            } else if (secondMap.get(value).equals(firstMap.get(value))) {
                return "unchanged";
            } else {
                return "changed";
            }
        }));
    }
}
//END
