package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> emails) {
        if (emails.isEmpty()) {
            return 0;
        }
        List<String> freeEmails = List.of("gmail.com", "yandex.ru", "hotmail.com");
        List<String> host = new ArrayList<>();
        for (String DomainName: emails) {
            String[] data = DomainName.split("@");
            host.add(data[1]);
        }
        return host.stream()
                .filter(freeEmails::contains)
                .count();
    }
}
// END
