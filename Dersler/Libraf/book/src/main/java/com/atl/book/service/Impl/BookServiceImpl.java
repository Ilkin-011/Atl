package com.atl.book.service.Impl;

import com.atl.book.client.AliVeNinoFeingClient;
import com.atl.book.client.LibrafFeingClient;
import com.atl.book.dto.BookResponseDto;
import com.atl.book.mapper.BookMapper;
import com.atl.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final LibrafFeingClient librafFeingClient;
    private final AliVeNinoFeingClient aliVeNinoFeingClient;
    private final BookMapper mapper;

    @Override
    public Map<String ,List<BookResponseDto>> getLibrafClient() {
        var a = aliVeNinoFeingClient.getBooksZovqeGOreVerilmishAd();
        var l = librafFeingClient.getBooksZovqeGOreVerilmishAd();

        return mapper.categoryTheBook(l,a);
    }
}