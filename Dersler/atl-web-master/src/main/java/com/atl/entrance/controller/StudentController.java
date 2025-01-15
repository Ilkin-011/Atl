package com.atl.entrance.controller;

import com.atl.entrance.dao.entity.StudentEntity;
import com.atl.entrance.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody StudentEntity studentEntity) {
        studentService.addStudent(studentEntity);
    }

    @GetMapping
    public List<StudentEntity> findAll() {
        return studentService.findAllStudent();
    }
}


