public class Book {
    private String title;
    private String genre;
    private Integer numberOfPages;

    public Book(String title, String genre, Integer numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "title= " + title + ", genre= " + genre + ", numberOfPages= " + numberOfPages ;
    }

}
