package com.atl.libraf.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.print.attribute.standard.MediaSize;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "libraf")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LibrafEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String bookName;
    String category;
    Long stock;
}

