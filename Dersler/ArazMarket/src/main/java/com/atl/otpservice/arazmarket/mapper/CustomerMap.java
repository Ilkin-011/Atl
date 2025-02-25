package com.atl.otpservice.arazmarket.mapper;

import com.atl.otpservice.arazmarket.dao.entity.CustomerEntity;
import com.atl.otpservice.arazmarket.dto.CustomerResponseDto;

import java.util.List;

public class CustomerMap {
    public List<CustomerResponseDto> customerToDto(List<CustomerEntity> entities) {
        return List.of();
    }

    public CustomerResponseDto customerToDto(CustomerEntity entity) {
        return null;
    }
}
