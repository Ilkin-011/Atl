package com.atl.spring.mapper;

import com.atl.spring.dto.StudentResponseDto;
import com.atl.spring.entity.StudentEntity;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
@Builder
public class StudentMapper {
    public List<StudentResponseDto> entityToMapDto(List<StudentEntity> entity) {
        List<StudentResponseDto> dto = new ArrayList<>();
        for (StudentEntity entity1 : entity) {
            var a = StudentResponseDto.builder().name(entity1.getName()).surname(entity1.getSurname()).gender(entity1.getGender()).build();
            dto.add(a);
        }
        return dto;
    }
}
