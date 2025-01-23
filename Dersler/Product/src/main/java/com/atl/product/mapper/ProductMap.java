package com.atl.product.mapper;

import com.atl.product.dto.ProductResponseDto;
import com.atl.product.entity.ProductEntity;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@RequiredArgsConstructor
@Builder
public class ProductMap{
    public List<ProductResponseDto> productDtoToEntity(List<ProductEntity> productEntityList) {
        List<ProductResponseDto> dtos = new ArrayList<>();
        for (ProductEntity s : productEntityList) {
            var dto = ProductResponseDto.builder()
                    .name(s.getName())
                    .price(s.getPrice())
                    .build();
            dtos.add(dto);
        }
        return dtos;
        }
        public ProductResponseDto getById(ProductEntity e){
        ProductResponseDto dto = ProductResponseDto.builder()
                .name(e.getName()).price(e.getPrice()).build();
        return dto;
        }
    }