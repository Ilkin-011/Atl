package com.atl.demo200.service;

import com.atl.demo200.Entity.BookEntity;
import com.atl.demo200.Genre;
import com.atl.demo200.dto.BookRequestDto;
import com.atl.demo200.repostirory.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public BookEntity saveBook(BookRequestDto bookRequestDto) {
        BookEntity bookEntity = mapToEntity(bookRequestDto);
        return bookRepository.save(bookEntity);
    }

    private BookEntity mapToEntity(BookRequestDto dto) {
        return BookEntity.builder()
                .author(dto.getAuthor())
                .bookName(dto.getBookName())
                .genre(dto.getGenre())
                .build();
    }
}
