package com.atl.demo200.dto;

import com.atl.demo200.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
    private String author;
    private String bookName;
    private Genre genre;
}
