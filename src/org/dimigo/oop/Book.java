package org.dimigo.oop;

public class Book {
    //Field Declaration

    private String title;
    private String author;
    private int page;

    /*
    //Method Declaration
    // Getter Method
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPage() {
        return page;
    }

    //Setter Method
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPage(int page) {
        if (page >= 0) {
            this.page = page;
        }
    }
    */

    // Basic Constructor
    public Book() {

    }

    // Adding Constructor
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    //Adding Constructor which only resets title & author
    public Book(String title, String author) {
        this(title, author, 100);
    }

    //Adding Constructor which only resets title
    public Book(String title) {
        this(title, "저자미상");
    }

    //Multiple Constructors are Available! => Called "Overloading"
    //Overloading -> Same Method Names, Different Variables Counts.
    //Or Different Variables Types.

    //Automatic Method Declaration

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

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
