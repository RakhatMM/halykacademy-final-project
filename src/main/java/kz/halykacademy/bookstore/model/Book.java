package kz.halykacademy.bookstore.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private long id;
    private double price;
    private List<Author> authors;
    private Publisher publisher;
    private String title;
    private int numOfPages;
    private int year;
    private static final AtomicInteger idCount = new AtomicInteger(0);

    public Book(double price, List<Author> authors, Publisher publisher, String title, int numOfPages, int year) {
        this.id = idCount.incrementAndGet();
        this.price = price;
        this.authors = authors;
        this.publisher = publisher;
        this.title = title;
        this.numOfPages = numOfPages;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
