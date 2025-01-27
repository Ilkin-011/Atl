package com.atl.entrance.service;

import com.atl.entrance.dto.StudentRequestDto;
import com.atl.entrance.dto.StudentResponseDto;

import java.util.List;

public interface StudentServicee {
    void addStudent(StudentRequestDto dto);
   List<StudentResponseDto>  getAll();
   StudentResponseDto findById(Long id);
   Long update(Long id, StudentRequestDto dto);
}
