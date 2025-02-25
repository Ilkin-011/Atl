package com.atl.book.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class BookEntity {
    @Id
    private Long id;
}
