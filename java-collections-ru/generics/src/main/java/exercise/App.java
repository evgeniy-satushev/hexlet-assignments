package exercise;

import java.util.*;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> listOfBooks = new ArrayList<>();
        if (books.isEmpty() || where.isEmpty()) {
            return listOfBooks;
        }
        List<String> values = new ArrayList<>(where.values());
        int count = 0;
        for (Map<String, String> book: books) {
            for (String value : values) {
                count += book.containsValue(value) ? 1 : 0;
            }
            if (count == values.size()) {
                listOfBooks.add(book);
            }
            count = 0;
        }
        return listOfBooks;
    }
}
//END
