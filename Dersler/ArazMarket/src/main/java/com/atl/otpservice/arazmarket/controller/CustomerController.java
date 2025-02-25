package com.atl.otpservice.arazmarket.controller;

import com.atl.otpservice.arazmarket.dto.CustomerRequestDto;
import com.atl.otpservice.arazmarket.dto.CustomerResponseDto;
import com.atl.otpservice.arazmarket.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("api/v1/market")
@RequiredArgsConstructor
public class CustomerController {
private final CustomerService customerService;
  @GetMapping("{id}")
  public CustomerResponseDto getCustomer(@PathVariable Long id){
      return customerService.findById(id);
  }
  @PostMapping()
    public void createCustomer(@RequestBody CustomerRequestDto customerRequestDto){
      customerService.add(customerRequestDto);
  }
  @GetMapping
    public List<CustomerResponseDto>getCustomers(){
      return customerService.findAll();
  }
  @DeleteMapping("{id}")
    public void deleteCustomers(@PathVariable Long id){
      customerService.deleteById(id);
  }
  @PutMapping("{id}")
    public void updateCustomer(@PathVariable Long id,@RequestBody CustomerRequestDto customerRequestDto){
      customerService.update(id,customerRequestDto);
  }
  @PostMapping("{customerId}")
  public void decreaseCustomer(@PathVariable Long customerId, @RequestParam BigDecimal price){
    customerService.decreaseBalance(customerId,price);
  }
}
