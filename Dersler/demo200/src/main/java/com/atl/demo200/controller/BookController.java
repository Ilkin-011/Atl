package com.atl.demo200.controller;

import com.atl.demo200.Entity.BookEntity;
import com.atl.demo200.dto.BookRequestDto;
import com.atl.demo200.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/books")
public class BookController {
    private final BookService bookService;

    @PostMapping("post")
    public BookEntity createBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.saveBook(bookRequestDto);
    }
}
