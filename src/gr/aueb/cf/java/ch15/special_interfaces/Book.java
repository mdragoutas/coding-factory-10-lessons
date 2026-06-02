package gr.aueb.cf.java.ch15.special_interfaces;

public class Book implements IProduct {
    private String title;
    private String author;
    private String isbn;
    private int id;

    public Book() {}

    public Book(String title, String author, String isbn, int id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
