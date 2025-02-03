package com.atl.bankapp.service.impl;

import com.atl.bankapp.dao.BankRepository;
import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.mapper.BankMapper;
import com.atl.bankapp.service.BankService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Data
public class BankServiceImpl implements BankService {
    private final BankRepository repository;
    private final BankMapper mapper;

    @Override
    public BankResponseDto getAll(Long id) {
        return mapper.entityToLIstDto(id);
    }
}
