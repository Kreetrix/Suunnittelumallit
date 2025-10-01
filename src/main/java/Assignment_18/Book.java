package Assignment_18;

public class Book implements Cloneable {
    String author;
    String title;
    String genre;
    String publicationYear;

    public Book(String author, String title, String genre, String publicationYear) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public Book(Book other) {
        this.author = other.author;
        this.title = other.title;
        this.genre = other.genre;
        this.publicationYear = other.publicationYear;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ", " + publicationYear + ")";
    }
}
