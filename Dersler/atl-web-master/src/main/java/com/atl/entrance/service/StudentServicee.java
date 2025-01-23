package com.atl.entrance.service;

import com.atl.entrance.dto.StudentResponseDto;

public interface StudentServicee {
    void addStudent(StudentResponseDto dto);
    StudentResponseDto getAll();
}
