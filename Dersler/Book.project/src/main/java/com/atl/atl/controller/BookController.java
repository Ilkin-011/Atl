package com.atl.atl.controller;

import com.atl.atl.entityy.GenreEntity;
import com.atl.atl.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/book")
@RestController
@RequiredArgsConstructor
public class BookController {
    private  final BookService bookService;
    @PostMapping("post")
    public GenreEntity saveBook(@RequestBody GenreEntity entity){
        return bookService.saveBook(entity);

    }
}
