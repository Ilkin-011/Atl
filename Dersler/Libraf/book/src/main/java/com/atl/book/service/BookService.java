package com.atl.book.service;

import com.atl.book.dto.BookResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface BookService {
    Map<String ,List<BookResponseDto>> getLibrafClient();

}
