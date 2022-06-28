import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> listOfBooks = new ArrayList<>();

    public static List<Book> showLibrary() {
        return Library.listOfBooks;
    }

    public static void addBook(Book book) {
        Library.listOfBooks.add(book);
    }
}
