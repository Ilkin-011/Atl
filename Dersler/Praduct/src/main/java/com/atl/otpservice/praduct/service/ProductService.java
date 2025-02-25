package com.atl.otpservice.praduct.service;

import com.atl.otpservice.praduct.dto.ProductDto;

public interface ProductService {
    void createProduct(ProductDto dto);
    ProductDto findById(Long id);
    void updateProduct(Long id,ProductDto dto);
    void increaseCount(Long id,Integer count);
    void deleteProduct(long id);

    void decreaseCount(Long productId, Integer count);
}
