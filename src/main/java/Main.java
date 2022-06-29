import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Would you like to ADD a Book(1) or Look up an Existing Book(2)?");

                String userInput = scanner.nextLine();
                if (userInput.equals("1")) {
                    getBookInput();
                } else if (userInput.equals("2")){
                    lookUpBook();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getBookInput() {
        try (Scanner scanner = new Scanner(System.in)) {

            String title = "";
            String genre = "";
            Integer numberOfPages = 0;
            System.out.println("Add a Book");

            System.out.print("Enter title: ");
            title = scanner.nextLine();
            System.out.print("Enter the Genre: ");
            genre = scanner.nextLine();

            System.out.print("Please enter the number of pages: ");
            numberOfPages = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, genre, numberOfPages);
            Library.addBook(title, book);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void lookUpBook() {
        try (Scanner scanner = new Scanner(System.in)) {

            String title = "";
            System.out.print("Enter the title of the book you are looking for: ");
            title = scanner.nextLine();

            Book book = Library.showLibraryCollection().get(title);

            if (book != null) {
                System.out.println(book);
            } else {
                System.out.println("Sorry that book is not in our library");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
