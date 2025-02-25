package com.atl.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibrafResponseDto {
    private String name;
    private String author;
    private Long stock;
    private BigDecimal price;

}
