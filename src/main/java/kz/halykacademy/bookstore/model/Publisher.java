package kz.halykacademy.bookstore.model;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Publisher {
    private long id;
    private String name;
    private List<Book> bookList;
    private static final AtomicInteger idCount = new AtomicInteger(0);

    public Publisher(String name, List<Book> bookList) {
        this.id = idCount.incrementAndGet();
        this.name = name;
        this.bookList = bookList;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
