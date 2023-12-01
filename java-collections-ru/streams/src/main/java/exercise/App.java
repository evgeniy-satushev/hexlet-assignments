package exercise;

import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        if (emails.isEmpty()) {
            return 0;
        }
        List<String> freeEmails = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emails.stream()
                .map(email -> email.substring(email.indexOf('@') + 1))
                .filter(freeEmails::contains)
                .count();
    }
}
// END
