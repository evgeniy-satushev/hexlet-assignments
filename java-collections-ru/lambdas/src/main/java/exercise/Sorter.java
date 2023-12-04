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

        Function<String, int[]> toArray = s -> {
            String[] arrayOfDate = s.split("-");
            int[] date = new int[arrayOfDate.length];
            for (int i = 0; i < arrayOfDate.length; i++) {
                date[i] = Integer.parseInt(arrayOfDate[i]);
            }
            return date;
        };

        Function<int[], LocalDate> toLocalDate = ints -> LocalDate.of(ints[0], ints[1], ints[2]);
        Function<String, LocalDate> birthdayToLocalDate = toArray.andThen(toLocalDate);
        Predicate<String> gender = "male"::equals;

        List<String> oldestNames = new ArrayList<>();
        List<LocalDate> dateOfBirthdays = new ArrayList<>();

        for (Map<String, String> user: users) {
            if (gender.test(user.get("gender"))) {
                dateOfBirthdays.add(birthdayToLocalDate.apply(user.get(BIRTHDAY)));
                oldestNames.add(user.get("name"));
            }
        }

        Map<String, LocalDate> oldUsers = new HashMap<>();
        for (int i = 0; i < oldestNames.size(); i++) {
            oldUsers.put(oldestNames.get(i), dateOfBirthdays.get(i));
        }

        return oldUsers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .peek(System.out::println)
                .map(Map.Entry::getKey)
                .toList();
    }
}
// END
