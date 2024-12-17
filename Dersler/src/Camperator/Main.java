package Camperator;

import Camperator.Book;
import Camperator.BookComperator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Book>books=new ArrayList<>();
//        books.add(new Book("Soroglu",550));
//        books.add(new Book("Koroglu",34));
//        books.add(new Book("Fesiller",700));
//        Collections.sort(books);
//        System.out.println("Sirasi : ");
//        for (Book book:books){
//            System.out.println(book);
//        }

        Book book = new Book("Koroglu", 500);
        Book book1 = new Book("Fesiller", 5350);
        Book book2 = new Book("Dede Qorqud", 543);
        Book book3 = new Book("Nizami Gencevi", 235);
        var books = Arrays.asList(book, book1, book2, book3);
        System.out.println(books);
        books.sort(new BookComperator());
        System.out.println(books);


    }
}
