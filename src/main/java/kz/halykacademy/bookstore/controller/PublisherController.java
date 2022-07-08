package kz.halykacademy.bookstore.controller;

import kz.halykacademy.bookstore.model.Publisher;
import kz.halykacademy.bookstore.provider.PublisherProvider;

import java.util.Collections;
import java.util.List;

public class PublisherController implements PublisherProvider {

    private static List<Publisher> publishers = List.of(
            new Publisher("Publisher 3", Collections.emptyList()),
            new Publisher("Publisher 4", Collections.emptyList())
    );
    @Override
    public List<Publisher> getAll() {
        return publishers;
    }
}
