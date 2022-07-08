package kz.halykacademy.bookstore.controller;

import kz.halykacademy.bookstore.model.Book;
import kz.halykacademy.bookstore.model.Publisher;
import kz.halykacademy.bookstore.provider.BookProvider;

import java.util.Collections;
import java.util.List;

public class BookController implements BookProvider {

    private static List<Book> books = List.of(
            new Book(19.99, Collections.emptyList(), new Publisher("Publisher 1", Collections.emptyList()),
                    "Title1", 199, 2022),
            new Book(19.99, Collections.emptyList(), new Publisher("Publisher 2", Collections.emptyList()),
                    "Title1", 277, 2022)
    );
    @Override
    public List<Book> getAll() {
        return books;
    }
}
