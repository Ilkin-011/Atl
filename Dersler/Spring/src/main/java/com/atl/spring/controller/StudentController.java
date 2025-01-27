package com.atl.spring.controller;

import com.atl.spring.dto.StudentRequestDto;
import com.atl.spring.dto.StudentResponseDto;
import com.atl.spring.dto.UpdateStudentDto;
import com.atl.spring.entity.StudentEntity;
import com.atl.spring.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/all")
    public List<StudentResponseDto> getAll(StudentResponseDto dto) {
        return studentService.getAll(dto);
    }

    @PostMapping("/post")
    public void writeStudent(@RequestBody StudentRequestDto dto) {
        studentService.writeStudent(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody UpdateStudentDto dto) {
        studentService.editStudent(id, dto);
    }
    @PatchMapping("/name/{id}")
    public void updateName(@RequestBody UpdateStudentDto dto,@PathVariable Long id){
        studentService.updateName(dto,id);
    }

    @GetMapping("/g")
    public List<StudentResponseDto>getir(@RequestParam String name){
        return  studentService.getAll(name);
    }
}
