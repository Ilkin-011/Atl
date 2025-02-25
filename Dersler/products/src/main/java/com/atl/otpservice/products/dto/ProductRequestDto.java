package com.atl.otpservice.products.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductRequestDto {
    private Long id;
    private String name;
    private BigDecimal price;
    private Integer count;

}

