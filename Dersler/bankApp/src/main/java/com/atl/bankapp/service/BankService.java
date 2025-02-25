package com.atl.bankapp.service;

import com.atl.bankapp.dto.BankRequestDto;
import com.atl.bankapp.dto.BankResponseDto;

import java.util.List;

public interface BankService {
    BankResponseDto getById(Long id);
  List<BankResponseDto> getAll();
  void addBank(BankRequestDto dto);
}
