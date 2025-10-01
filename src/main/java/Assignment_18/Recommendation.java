package Assignment_18;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> books;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void setTargetAudience(String audience) {
        this.targetAudience = audience;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation copy = (Recommendation) super.clone();
            copy.books = new ArrayList<>();
            for (Book b : this.books) {
                copy.books.add(b.clone());
            }
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recommendation for -> ").append(targetAudience).append("\n");
        for (Book b : books) {
            sb.append(" - ").append(b).append("\n");
        }
        return sb.toString();
    }

}
