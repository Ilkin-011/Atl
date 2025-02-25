package com.atl.atl.repository;

import com.atl.atl.entityy.GenreEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
@Repository
public interface BookRepository extends JpaRepository  <GenreEntity,Long>{
}
