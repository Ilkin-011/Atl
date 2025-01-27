package com.atl.spring.service;

import com.atl.spring.dto.StudentRequestDto;
import com.atl.spring.dto.StudentResponseDto;
import com.atl.spring.dto.UpdateStudentDto;
import com.atl.spring.entity.StudentEntity;
import com.atl.spring.mapper.StudentMapper;
import com.atl.spring.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper mapp;

    public List<StudentResponseDto> getAll(StudentResponseDto dto) {
        List<StudentEntity> entity = repository.findAll();
        return mapp.entityToMapDto(entity);
    }

    public void writeStudent(StudentRequestDto dto) {
        StudentEntity entities = StudentEntity.builder()
                .name(dto.getName())
                .surname(dto.getSurname()).gender(dto.getGender())
                .build();
        repository.save(entities);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    public UpdateStudentDto editStudent(Long id, UpdateStudentDto dto) {
        Optional<StudentEntity> studentEntity = repository.findById(id);
        if (studentEntity.isPresent()) {
            StudentEntity existingStudent = studentEntity.get();
            existingStudent.setName(dto.getName());
            repository.save(existingStudent);
        }
        return UpdateStudentDto.builder().name(dto.getName()).build();
    }
    @Transactional
    public void updateName(UpdateStudentDto dto,Long id){
        repository.updateName(dto.getName(), id);

    }
    public List<StudentResponseDto> getAll(String name) {
        return mapp.entityToMapDto(repository.getir(name));
    }
}

