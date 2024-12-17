package Camperator;

import Camperator.Book;
import Camperator.BookComperator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Koroglu", 500);
        Book book1 = new Book("Fesiller", 5350);
        Book book3 = new Book("Nizami Gencevi", 235);
        Book book2 = new Book("Dede Qorqud", 543);
        var books = Arrays.asList(book, book1, book2, book3);
        System.out.println(books);
        books.sort(new BookComperator());
        System.out.println(books);
    }
}
