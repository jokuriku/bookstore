package bookstore.bookstore.domain;

public class Book {
    private String author;
    private String isbn;
    private double price;
    private int publicationYear;
    private String title;

    public Book() {
        super();
        this.author = "";
        this.isbn = "";
        this.price = 0;
        this.publicationYear = 0;
        this.title = "";
    }

    public Book(String author, String isbn, double price, int publicationYear, String title) {
        super();
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.publicationYear = publicationYear;
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getTitle() {
        return title;
    }
}
