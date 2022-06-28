import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getBookInput();
        System.out.println("---Anug's Library---");
        System.out.println(Library.showLibrary());
    }

    public static void getBookInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
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
                Library.addBook(book);

                System.out.print("Do you want to add another book (y/n): ");
                Boolean isComplete = scanner.nextLine().equals("n");
                if (isComplete) {
                    return;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
