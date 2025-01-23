package com.atl.product.service;

import com.atl.product.dto.ProductRequestDto;
import com.atl.product.dto.ProductResponseDto;

import java.util.List;

public interface ProductServicelpml {
    void addProduct(ProductRequestDto dto);

    List<ProductResponseDto> getProduct();

    ProductResponseDto getById(Long id);

    ProductRequestDto updateProduct(ProductRequestDto dto,Long id);
}

