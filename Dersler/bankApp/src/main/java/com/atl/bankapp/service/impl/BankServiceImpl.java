package com.atl.bankapp.service.impl;

import com.atl.bankapp.dao.entity.BankEntity;
import com.atl.bankapp.dao.repository.BankRepository;
import com.atl.bankapp.dto.BankRequestDto;
import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.mapper.BankMapper;
import com.atl.bankapp.service.BankService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Data
public class BankServiceImpl implements BankService {
    private final BankRepository repository;
    private final BankMapper mapper;

    @Override
    public BankResponseDto getById(Long id) {
        return mapper.entityToLIstDto(id);
    }

    @Override
    public List<BankResponseDto> getAll() {
        return mapper.entityListToDtos(repository.findAll());
    }

    @Override
    public void addBank(BankRequestDto dto) {
        BankEntity entity=BankEntity.builder()
                .bankName(dto.getBankName())
                .build();
        repository.save(entity);
    }
}
