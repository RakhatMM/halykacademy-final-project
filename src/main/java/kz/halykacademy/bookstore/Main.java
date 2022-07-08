package kz.halykacademy.bookstore;

import kz.halykacademy.bookstore.controller.AuthorController;
import kz.halykacademy.bookstore.controller.BookController;
import kz.halykacademy.bookstore.controller.PublisherController;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println(new AuthorController().getAll());
        System.out.println(new BookController().getAll());
        System.out.println(new PublisherController().getAll());
    }
}
