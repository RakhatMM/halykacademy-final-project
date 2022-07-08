package kz.halykacademy.bookstore.provider;

import kz.halykacademy.bookstore.model.Book;

import java.util.List;

public interface BookProvider {
    List<Book> getAll();
}
