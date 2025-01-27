package com.atl.entrance.service.lml;


import com.atl.entrance.dao.entity.StudentEntity;
import com.atl.entrance.dao.repository.StudentRepository;

import com.atl.entrance.dto.StudentRequestDto;
import com.atl.entrance.dto.StudentResponseDto;
import com.atl.entrance.mapper.StudentMapper;
import com.atl.entrance.service.StudentServicee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public  class StudentService implements StudentServicee {
    private final StudentRepository repository;
    private final StudentMapper mapper;
    public  StudentEntity addStudent(StudentEntity entity) {
        return repository.save(entity);
    }


    public List<StudentEntity>findAllStudent(){
        return repository.findAll();
    }

    @Override
    public void addStudent(StudentRequestDto dto) {
        StudentEntity entity=StudentEntity
                .builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .build();
        repository.save(entity);

    }

    @Override
    public List<StudentResponseDto> getAll() {
        List<StudentEntity>entities=repository.findAll();
        return mapper.studentDtoToEntity(entities);
    }

    @Override
    public StudentResponseDto findById(Long id) {
        Optional<StudentEntity>optionalStudentEntity=repository.findById(id);
        StudentEntity studentEntity= StudentEntity.builder().build();
        if (optionalStudentEntity.isPresent()){
            studentEntity=optionalStudentEntity.get();
        }
        return mapper.studentResponseDtoById(studentEntity);
    }

    @Override
    public Long update(Long id, StudentRequestDto dto) {
        Optional<StudentEntity>optionalStudentEntity=repository.findById(id);
        if (optionalStudentEntity.isPresent()){
         StudentEntity studentEntity =optionalStudentEntity.get();
            studentEntity.setName(dto.getName());
            studentEntity.setSurname(dto.getSurname());
            repository.save(studentEntity);
            return id;
        }
        return  0L;
    }
}
