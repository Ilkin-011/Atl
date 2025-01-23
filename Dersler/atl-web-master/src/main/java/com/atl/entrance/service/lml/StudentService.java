package com.atl.entrance.service;


import com.atl.entrance.dao.entity.StudentEntity;
import com.atl.entrance.dao.repository.StudentRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public  class StudentService {
    private final StudentRepository repository;
    public  StudentEntity addStudent(StudentEntity entity) {
        return repository.save(entity);

    }
    public List<StudentEntity>findAllStudent(){
        return repository.findAll();
    }

}