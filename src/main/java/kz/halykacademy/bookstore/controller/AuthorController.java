package kz.halykacademy.bookstore.controller;

import kz.halykacademy.bookstore.model.Author;
import kz.halykacademy.bookstore.provider.AuthorProvider;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class AuthorController implements AuthorProvider {

    private static List<Author> authors = List.of(
            new Author("Surname1", "Name1", "Patronymic1",
                    LocalDate.of(1988, 11, 22), Collections.emptyList()),
            new Author("Surname2", "Name2", "Patronymic2",
                    LocalDate.of(1977, 11, 30), Collections.emptyList())
    );
    @Override
    public List<Author> getAll() {
        return authors;
    }
}
