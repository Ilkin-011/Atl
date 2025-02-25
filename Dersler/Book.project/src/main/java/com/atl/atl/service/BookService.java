package com.atl.atl.service;

import com.atl.atl.entityy.GenreEntity;
import com.atl.atl.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class BookService {
    private final BookRepository repository;

    public List<GenreEntity> getAllBook() {
       return repository.findAll();
    }
    public GenreEntity saveBook(GenreEntity entity){
        return repository.save(entity);
    }
}

