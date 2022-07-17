package kz.halykacademy.bookstore.provider;

import kz.halykacademy.bookstore.model.Publisher;

import java.util.Collections;
import java.util.List;

public class PublisherProviderImpl implements PublisherProvider {

    private static List<Publisher> publishers = List.of(
            new Publisher("Publisher 3", Collections.emptyList()),
            new Publisher("Publisher 4", Collections.emptyList())
    );
    @Override
    public List<Publisher> getAll() {
        return publishers;
    }
}
