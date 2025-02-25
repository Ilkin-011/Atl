package com.atl.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponseDto {
    private String Bookname;
    private Long stock;
    private BigDecimal price;
}
