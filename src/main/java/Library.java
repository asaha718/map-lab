import java.util.HashMap;

public class Library {
    private static HashMap<String, Book> collectionOfBooks = new HashMap<>();
    private static HashMap<String, Book> collectionOfBooks = new HashMap<>();

    public static HashMap<String, Book> showLibraryCollection() {
        return Library.collectionOfBooks;
    }

    public static void addBook(String title, Book book) {
        Library.collectionOfBooks.put(title, book);
    }

}
