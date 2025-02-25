package com.atl.libraf.mapper;

import com.atl.libraf.dao.entity.LibrafEntity;
import com.atl.libraf.dto.LibrafResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class LibrafMapper {
    public List<LibrafResponseDto>entityListToDtoList(List<LibrafEntity>entities){
        List<LibrafResponseDto>dtos=new ArrayList<LibrafResponseDto>();
        for (LibrafEntity e:entities){
            LibrafResponseDto dto =LibrafResponseDto.builder()
                    .bookName(e.getBookName())
                    .category(e.getCategory())
                    .stock(e.getStock()).build();
            dtos.add(dto);
        }
        return dtos;
    }
    public LibrafResponseDto entityToDto(LibrafEntity entity){
        LibrafResponseDto dto=LibrafResponseDto.builder()
                .bookName(entity.getBookName())
                .category(entity.getCategory())
                .stock(entity.getStock())
                .build();
        return dto;
    }

}
