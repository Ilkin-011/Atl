package com.atl.otpservice.arazmarket.mapper;

import com.atl.otpservice.arazmarket.dao.entity.CustomerEntity;
import com.atl.otpservice.arazmarket.dto.CustomerRequestDto;
import com.atl.otpservice.arazmarket.dto.CustomerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)

public interface CustomerMapper {
    @Mapping(source = "name",target = "name")
List<CustomerResponseDto>customerListToDto(List<CustomerEntity>entities);
    CustomerResponseDto customerToEntity(CustomerEntity entity);
    CustomerEntity entityToCustomer(CustomerRequestDto dto);

}
