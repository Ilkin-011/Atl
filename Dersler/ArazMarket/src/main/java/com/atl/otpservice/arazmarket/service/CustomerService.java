package com.atl.otpservice.arazmarket.service;

import com.atl.otpservice.arazmarket.dto.CustomerRequestDto;
import com.atl.otpservice.arazmarket.dto.CustomerResponseDto;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public interface CustomerService {
    CustomerResponseDto findById(Long id);
    List<CustomerResponseDto>findAll();
    void add(CustomerRequestDto customerRequestDto);
    void update(Long id,CustomerRequestDto customerRequestDto);
    void deleteById(Long id);
    void decreaseBalance(Long customerId, BigDecimal price);
}
