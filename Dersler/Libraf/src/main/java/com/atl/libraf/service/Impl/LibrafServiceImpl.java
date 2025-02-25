package com.atl.libraf.service.Impl;

import com.atl.libraf.dao.entity.LibrafEntity;
import com.atl.libraf.dao.repostiroy.LibrafRepository;
import com.atl.libraf.dto.LibrafRequestDto;
import com.atl.libraf.dto.LibrafResponseDto;
import com.atl.libraf.mapper.LibrafMap;
import com.atl.libraf.mapper.LibrafMapper;
import com.atl.libraf.service.LibrafService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibrafServiceImpl implements LibrafService {
    private final LibrafRepository repository;
    //    private final LibrafMapper mapper;
    private final LibrafMap map;

    @Override
    public LibrafResponseDto librafGetById(Long id) throws RuntimeException {
        return repository.findById(id)
                .map(map::toResponseDto)
                .orElseThrow(()->new RuntimeException());
    }

    @Override
    public List<LibrafResponseDto> getAllLibraf() {
        return repository.findAll().stream()
                .map(map::toResponseDto)
                .toList();
    }

    @Override
    public void deleteLibrafById(Long id) {
        repository.findById(id).ifPresent(entity -> repository.deleteById(id));
    }

    @Override
    public void addLibraf(LibrafRequestDto dto) {
    LibrafEntity entity=map.toEntity(dto);
    map.toResponseDto(repository.save(entity));
    }

    @Override
    public void updateLibraf(LibrafRequestDto dto, Long id) {
        LibrafEntity entity =repository.findById(id).orElseThrow(()->new RuntimeException());
        map.updateFromToEntity(dto,entity);
        repository.save(entity);
    }
}

