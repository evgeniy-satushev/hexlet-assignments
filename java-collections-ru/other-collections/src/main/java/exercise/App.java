package exercise;


import java.util.*;

// BEGIN
public class App {
    public static Map<String, Object> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        Map<String, Object> test = new LinkedHashMap<>();
        Map<String, Object> combainedMap = new HashMap<>(firstMap);
        combainedMap.putAll(secondMap);
        for (Map.Entry<String, Object> entry: combainedMap.entrySet()) {
            boolean isEqualKeys = secondMap.containsKey(entry.getKey()) && firstMap.containsKey(entry.getKey());
            boolean isEqualValues = secondMap.containsValue(entry.getValue()) && firstMap.containsValue(entry.getValue());
            if (!firstMap.containsKey(entry.getKey())) {
                test.put(entry.getKey(), "added");
            } else if (!secondMap.containsKey(entry.getKey())) {
                test.put(entry.getKey(), "deleted");
            } else if (isEqualKeys && !isEqualValues) {
                test.put(entry.getKey(), "changed");
            } else {
                test.put(entry.getKey(), "unchanged");
            }
        }
        return test;
    }
}
//END
