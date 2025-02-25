package com.atl.entrance.mapper;

import com.atl.entrance.dao.entity.StudentEntity;
import com.atl.entrance.dto.StudentResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {
    public List<StudentResponseDto> studentDtoToEntity(List<StudentEntity> studentEntityList) {
        List<StudentResponseDto> dtos = new ArrayList<>();
        for (StudentEntity s : studentEntityList) {
            var dto = StudentResponseDto.builder()
                    .name(s.getName())
                    .build();
            dtos.add(dto);
        }
        return dtos;
    }

    public StudentResponseDto studentResponseDtoById(StudentEntity entity){
        return StudentResponseDto.builder()
                .name(entity.getName())
                .surname(entity.getSurname())
                .build();
    }
}
