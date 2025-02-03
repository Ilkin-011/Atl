package com.atl.bankapp.service;

import com.atl.bankapp.dto.BankResponseDto;

import java.util.List;

public interface BankService {
    BankResponseDto getAll(Long id);
}
