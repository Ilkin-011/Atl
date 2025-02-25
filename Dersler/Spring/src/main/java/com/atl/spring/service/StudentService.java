package com.atl.spring.service;

import com.atl.spring.dto.AcademyResponseDto;
import com.atl.spring.dto.StudentRequestDto;
import com.atl.spring.dto.StudentResponseDto;
import com.atl.spring.dto.UpdateStudentDto;
import com.atl.spring.entity.StudentEntity;
import com.atl.spring.exception.StudentNotFoundException;
import com.atl.spring.mapper.StudentMapper;
import com.atl.spring.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
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
        StudentEntity existingStudent = repository.findById(id).orElseThrow(StudentNotFoundException::new);
            existingStudent.setName(dto.getName());
            repository.save(existingStudent);
        return UpdateStudentDto.builder().name(dto.getName()).build();
    }

    public UpdateStudentDto updateById(UpdateStudentDto responseDto,Long id){
     StudentEntity studentEntity=repository.findById(id).orElseThrow(StudentNotFoundException::new);
            studentEntity.setName(responseDto.getName());
            studentEntity.setSurname(responseDto.getSurname());
            studentEntity.setGender(responseDto.getGender());
            repository.save(studentEntity);

        return UpdateStudentDto.builder()
                .name(responseDto.getName())
                .Surname(responseDto.getSurname())
                .gender(responseDto.getGender())
                .build();
    }


    public List<StudentResponseDto> getAll(String name) {
        return mapp.entityToMapDto(repository.getir(name));
    }

    public List<AcademyResponseDto> academy() {
        return repository.academy();
    }

    public List<AcademyResponseDto> all() {
        return repository.all();
    }
    public StudentResponseDto update(Long id, StudentResponseDto dto) {
        StudentEntity optionalStudentEntity = repository.findById(id).orElseThrow(() -> new StudentNotFoundException("id Not found"));

        StudentEntity studentEntity = optionalStudentEntity;
        studentEntity.setName(dto.getName());
        studentEntity.setSurname(dto.getSurname());
        studentEntity.setGender(dto.getGender());
        repository.save(studentEntity);
        return StudentResponseDto.builder().name(dto.getName()).surname(dto.getSurname()).gender(dto.getGender()).build();
    }
}

