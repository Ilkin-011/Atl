package com.atl.libraf.service;

import com.atl.libraf.dao.entity.LibrafEntity;
import com.atl.libraf.dto.LibrafRequestDto;
import com.atl.libraf.dto.LibrafResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface LibrafService {
    LibrafResponseDto librafGetById(Long id) throws Exception;
     List<LibrafResponseDto>getAllLibraf();
      void deleteLibrafById(Long id);
     void addLibraf(LibrafRequestDto dto);
     void updateLibraf(LibrafRequestDto dto,Long id);

}
