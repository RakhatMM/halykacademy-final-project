package kz.halykacademy.bookstore.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {
    private long id;
    private double price;
    private List<Author> authorList;
    private Publisher publisher;
    private String title;
    private int numOfPages;
    private int year;
    private static final AtomicInteger idCount = new AtomicInteger(0);

    public Book(double price, List<Author> authorList, Publisher publisher, String title, int numOfPages, int year) {
        this.id = idCount.incrementAndGet();
        this.price = price;
        this.authorList = authorList;
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

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", price=" + price +
                ", authors=" + authorList +
                ", publisher=" + publisher +
                ", title='" + title + '\'' +
                ", numOfPages=" + numOfPages +
                ", year=" + year +
                '}';
    }
}
