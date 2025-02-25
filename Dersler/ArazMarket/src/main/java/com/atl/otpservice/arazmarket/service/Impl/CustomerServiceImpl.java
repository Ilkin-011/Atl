package com.atl.otpservice.arazmarket.service.Impl;

import com.atl.otpservice.arazmarket.dao.entity.CustomerEntity;
import com.atl.otpservice.arazmarket.dao.repository.CustomerRepository;
import com.atl.otpservice.arazmarket.dto.CustomerRequestDto;
import com.atl.otpservice.arazmarket.dto.CustomerResponseDto;
import com.atl.otpservice.arazmarket.exception.CustomerNotFoundException;
import com.atl.otpservice.arazmarket.mapper.CustomerMapper;
import com.atl.otpservice.arazmarket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;
    @Override
    public CustomerResponseDto findById(Long id) {
        return repository.findById(id)
                .map(mapper::customerToEntity)
                .orElseThrow(()->new CustomerNotFoundException("customer not found"));
    }

    @Override
    public List<CustomerResponseDto> findAll() {
        List<CustomerEntity>list=repository.findAll();
        return mapper.customerListToDto(list);
    }

    @Override
    public void add(CustomerRequestDto customerRequestDto) {
    repository.save(mapper.entityToCustomer(customerRequestDto));
    }

    @Override
    public void update(Long id, CustomerRequestDto customerRequestDto) {
    CustomerEntity entity=repository.findById(id).orElseThrow(()->new CustomerNotFoundException("Customer not Found"));
    entity.setAge(customerRequestDto.getAge());
    entity.setFullName(customerRequestDto.getFullName());
    entity.setBalance(customerRequestDto.getBalance());
    repository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
    var entity=repository.findById(id).orElseThrow(()->new CustomerNotFoundException("Not found customer"));
    repository.delete(entity);
    }

    @Override
    public void decreaseBalance(Long customerId, BigDecimal price) {
    CustomerEntity entity =repository.findById(customerId).orElseThrow(()->new CustomerNotFoundException("Customer not found"));
    entity.setBalance(entity.getBalance().subtract(price));
    repository.save(entity);
    }
}
