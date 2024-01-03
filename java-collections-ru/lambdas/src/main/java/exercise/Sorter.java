package exercise;

import java.util.*;
import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        if (users.isEmpty()) {
            return new ArrayList<>();
        }
        final String BIRTHDAY = "birthday";
        Function<String, LocalDate> parseDate = LocalDate::parse;
        Predicate<String> gender = "male"::equals;
        Comparator<LocalDate> comparator = Comparator.naturalOrder();
        return users.stream()
                .filter(user -> gender.test(user.get("gender")))
                .sorted((firstUser, secondUser) ->
                        comparator.compare(parseDate.apply(firstUser.get(BIRTHDAY)),
                        parseDate.apply(secondUser.get(BIRTHDAY))))
                .map(name -> name.get("name"))
                .toList();
    }
}
// END
