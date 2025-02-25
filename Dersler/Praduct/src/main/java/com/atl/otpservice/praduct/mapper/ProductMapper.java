package com.atl.otpservice.praduct.mapper;

import com.atl.otpservice.praduct.dao.entity.ProductEntity;
import com.atl.otpservice.praduct.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING
        ,unmappedSourcePolicy = ReportingPolicy.IGNORE
        ,unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
    ProductDto toDto(ProductEntity entity);
    ProductEntity toEntity(ProductDto dto);
}
