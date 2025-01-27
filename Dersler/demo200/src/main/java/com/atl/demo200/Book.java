package com.atl.demo200;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String author;
    private String bookName;
    private double price;
    private Genre genre;
}
