package com.atl.entrance.controller;

import com.atl.entrance.dao.entity.StudentEntity;
import com.atl.entrance.dto.StudentRequestDto;
import com.atl.entrance.dto.StudentResponseDto;
import com.atl.entrance.service.lml.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/post")
    public void addStudent(@RequestBody StudentRequestDto dto) {
        studentService.addStudent(dto);
    }

    @GetMapping("/get")
    public List<StudentResponseDto> getAll() {
        return studentService.getAll();
    }
    @GetMapping("{id}")
    public StudentResponseDto getById(@PathVariable Long id){
        return studentService.findById(id);
    }
    @PostMapping("{id}")
    public Long getUpdate(@RequestBody StudentRequestDto dto, @PathVariable Long id){
        return studentService.update(id, dto);
    }
}


