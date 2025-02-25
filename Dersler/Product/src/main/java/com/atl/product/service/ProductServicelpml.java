package com.atl.product.service;

import com.atl.product.dto.ProductRequestDto;
import com.atl.product.dto.ProductResponseDto;
import com.atl.product.dto.UpdateProductDto;
import com.atl.product.entity.ProductEntity;

import java.math.BigDecimal;
import java.util.List;

public interface ProductServicelpml {
    void addProduct(ProductRequestDto dto);

    List<ProductResponseDto> getProduct();

    ProductResponseDto getById(Long id);

    ProductRequestDto updateProduct(ProductRequestDto dto,Long id);
    List<ProductResponseDto> findAllTable(String name);
        void updatePPrice(UpdateProductDto dto,Long id);
}

