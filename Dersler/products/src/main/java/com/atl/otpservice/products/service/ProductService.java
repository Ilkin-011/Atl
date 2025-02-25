package com.atl.otpservice.products.service;

import com.atl.otpservice.products.dto.ProductRequestDto;
import com.atl.otpservice.products.dto.ProductResponseDto;

public interface ProductService {
    void createProduct(ProductRequestDto productRequestDto);

    ProductResponseDto findById(Long id);

    void updateProduct(Long id, ProductRequestDto productRequestDto);
    void increaseCount(Long id, Integer count);

    void deleteProduct(long id);

    void decreaseCount(Long productId, Integer count);
}
