package com.atl.otpservice.products.service.Impl;

import com.atl.otpservice.products.dao.repository.ProductRepository;
import com.atl.otpservice.products.dto.ProductRequestDto;
import com.atl.otpservice.products.dto.ProductResponseDto;
import com.atl.otpservice.products.exception.ProductNotFoundException;
import com.atl.otpservice.products.mapper.ProductMapper;
import com.atl.otpservice.products.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;
    @Override
     public void createProduct(ProductRequestDto productRequestDto) {

    }

    @Override
    public ProductResponseDto findById(Long id) {
        return null;
    }

    @Override
    public void updateProduct(Long id, ProductRequestDto productRequestDto) {

    }

    @Override
    public void increaseCount(Long id, Integer count) {
    var entity= repository.findById(id).get();
    entity.setCount(entity.getCount() + count);
    repository.save(entity);
    }

    @Override
    public void deleteProduct(long id) {
    repository.deleteById(id);
    }

    @Override
    public void decreaseCount(Long productId, Integer count) {

    }
}
