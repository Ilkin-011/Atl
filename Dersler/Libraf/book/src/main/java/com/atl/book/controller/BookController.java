package com.atl.book.controller;

import com.atl.book.dto.BookResponseDto;
import com.atl.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;
    @GetMapping
    public Map<String ,List<BookResponseDto>> getAllBooks(){
      return   bookService.getLibrafClient();
    }
}

