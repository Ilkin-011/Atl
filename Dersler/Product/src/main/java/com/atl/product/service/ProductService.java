package com.atl.product.service;

import com.atl.product.dto.ProductRequestDto;
import com.atl.product.dto.ProductResponseDto;
import com.atl.product.dto.UpdateProductDto;
import com.atl.product.entity.ProductEntity;
import com.atl.product.mapper.ProductMap;
import com.atl.product.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements ProductServicelpml {
    private final ProductRepository repository;
    private final ProductMap mapper;

    @Override
    public void addProduct(ProductRequestDto dto) {
        ProductEntity entity = ProductEntity
                .builder()
                .name(dto.getName())
                .price(dto.getPrice())
                .build();
        repository.save(entity);
    }

    @Override
    public List<ProductResponseDto> getProduct() {
        List<ProductEntity> entity = repository.findAll();
        return mapper.productDtoToEntity(entity);
    }

    @Override
    public ProductResponseDto getById(Long id) {
        Optional<ProductEntity> optionalProductEntity = repository.findById(id);
        ProductEntity entity = ProductEntity.builder().build();
        if (optionalProductEntity.isPresent()) {
            entity = optionalProductEntity.get();
        }
        return mapper.getById(entity);
    }

    @Override
    public ProductRequestDto updateProduct(ProductRequestDto dto, Long id) {
        Optional<ProductEntity> optionalProductEntity = repository.findById(id);


        if (optionalProductEntity.isPresent()) {
            ProductEntity productEntity = optionalProductEntity.get();

            productEntity.setName(dto.getName());
            productEntity.setPrice(dto.getPrice());
            repository.save(productEntity);
        }
        return ProductRequestDto.builder()
                .name(dto.getName())
                .price(dto.getPrice()).build();
    }

    @Override
    public List<ProductResponseDto> findAllTable(String name) {
       return mapper.productDtoToEntity( repository.findAllTable(name));
    }
    @Transactional
    @Override
    public void updatePPrice(UpdateProductDto dto, Long id) {
        repository.updatePrice(dto.getPrice(),id);
    }
}




