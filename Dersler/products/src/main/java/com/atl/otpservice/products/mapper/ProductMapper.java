package com.atl.otpservice.products.mapper;

import com.atl.otpservice.products.dao.entity.ProductEntity;

import com.atl.otpservice.products.dto.ProductRequestDto;
import com.atl.otpservice.products.dto.ProductResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductRequestDto toDto(ProductEntity productEntity);

    ProductEntity toEntity(ProductRequestDto productDto);
}