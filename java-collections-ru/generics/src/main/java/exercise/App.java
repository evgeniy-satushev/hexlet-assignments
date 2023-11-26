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
        for (Map<String, String> book: books) {
            if (filteredBooks(book, values)) {
                listOfBooks.add(book);
            }
        }
        return listOfBooks;
    }
    public static boolean filteredBooks(Map<String, String> book, List<String> values) {
        int count = 0;
        for (Map.Entry<String, String> entry: book.entrySet()) {
            if (values.contains(entry.getValue())) {
                count++;
            }
        }
        return count == values.size();
    }
}
//END
