package com.atl.demo200.util;

import com.atl.demo200.Book;
import com.atl.demo200.Genre;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
@Component
public class MacBook {

    public List<Book> getBook() {

        return Arrays.asList(new Book("Seyid","gunebaxan",20.0, Genre.DRAM));

    }
}