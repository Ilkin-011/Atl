package com.atl.bankapp.controller;

import com.atl.bankapp.dto.BankRequestDto;
import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/bank")
public class BankController {
private final BankService bankService;
    @GetMapping("/get/{id}")
    public BankResponseDto user(@PathVariable Long id){
   return bankService.getById(id);
}
    @GetMapping("/get")
    public List<BankResponseDto> user(){
        return bankService.getAll();
}
    @PostMapping
    public void addbank(@RequestBody BankRequestDto dto){
        bankService.addBank(dto);
    }
}
