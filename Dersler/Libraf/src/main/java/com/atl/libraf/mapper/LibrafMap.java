package com.atl.libraf.mapper;

import com.atl.libraf.dao.entity.LibrafEntity;
import com.atl.libraf.dto.LibrafRequestDto;
import com.atl.libraf.dto.LibrafResponseDto;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
unmappedSourcePolicy = ReportingPolicy.IGNORE,
unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface LibrafMap {
    LibrafEntity toEntity(LibrafRequestDto dto);
    LibrafResponseDto toResponseDto(LibrafEntity entity);
    void updateFromToEntity(LibrafRequestDto dto,@MappingTarget LibrafEntity entity);
}
