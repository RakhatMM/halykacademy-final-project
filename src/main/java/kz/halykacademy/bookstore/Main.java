package kz.halykacademy.bookstore;

import kz.halykacademy.bookstore.provider.AuthorProviderImpl;
import kz.halykacademy.bookstore.provider.BookProviderImpl;
import kz.halykacademy.bookstore.provider.PublisherProviderImpl;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println(new AuthorProviderImpl().getAll());
        System.out.println(new BookProviderImpl().getAll());
        System.out.println(new PublisherProviderImpl().getAll());
    }
}
