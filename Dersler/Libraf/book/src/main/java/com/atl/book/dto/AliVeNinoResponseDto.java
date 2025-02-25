package com.atl.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AliVeNinoResponseDto {
    private String name;
    private Long stock;
    private  BigDecimal price;
}
