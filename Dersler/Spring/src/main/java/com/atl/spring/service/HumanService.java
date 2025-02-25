package com.atl.spring.service;

import com.atl.spring.dto.HumanRequestDto;
import com.atl.spring.dto.HumanResponseDto;
import com.atl.spring.dto.HumanUpdateDto;
import com.atl.spring.entity.HumanEntity;
import com.atl.spring.mapper.HumanMapper;
import com.atl.spring.repository.HumanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class HumanService {
    private final HumanRepository repository;
    private final HumanMapper mapper;
    public List<HumanResponseDto> getHuman() {
        return mapper.entityListToDto(repository.findAll());
    }
    public void getAll(HumanRequestDto dto){
        HumanEntity entity=HumanEntity.builder().firstName(dto.getFirstName()).lastName(dto.getLastName()).build();
        repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public HumanUpdateDto edit(Long id, HumanUpdateDto dto) {
        Optional<HumanEntity> dto1 = repository.findById(id);
        if (dto1.isPresent()) {
            HumanEntity entity = dto1.get();
            entity.setFirstName(dto.getFirstName());
            entity.setLastName(dto.getLastName());
//            return mapper.entityListToDto(repository.save(entity));
        }
        return null;
        }
}
