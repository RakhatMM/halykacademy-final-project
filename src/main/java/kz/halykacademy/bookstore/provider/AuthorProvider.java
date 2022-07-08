package kz.halykacademy.bookstore.provider;

import kz.halykacademy.bookstore.model.Author;

import java.util.List;

public interface AuthorProvider {
    List<Author> getAll();
}
