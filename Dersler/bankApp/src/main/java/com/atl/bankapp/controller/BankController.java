package com.atl.bankapp.controller;

import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/bank")
public class BankController {
private final BankService bankService;
@GetMapping("/get/{id}")
    public BankResponseDto user(@PathVariable Long id){
   return bankService.getAll(id);
}
}
