package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String file) {
        return file.lines()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .map(x -> x.replaceAll("\"", ""))
                .map(x -> x.replaceAll("environment=", ""))
                .filter(x -> x.startsWith("X_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
