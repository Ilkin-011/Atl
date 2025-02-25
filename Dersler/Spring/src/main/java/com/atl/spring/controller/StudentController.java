package com.atl.spring.controller;

import com.atl.spring.dto.AcademyResponseDto;
import com.atl.spring.dto.StudentRequestDto;
import com.atl.spring.dto.StudentResponseDto;
import com.atl.spring.dto.UpdateStudentDto;
import com.atl.spring.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/students")
@Slf4j
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

    @PutMapping("/updatePut/{id}")
    public StudentResponseDto updateStudent(@PathVariable Long id, @RequestBody StudentResponseDto dto) {
       return studentService.update(id, dto);
    }

    @PatchMapping("/updatePatch/{id}")
    public UpdateStudentDto updateByid(@RequestBody UpdateStudentDto dto, @PathVariable Long id) {
        return studentService.updateById(dto,id);
    }

    @GetMapping("/leftjoin")
    public List<StudentResponseDto> getir(@RequestParam String name) {
        return studentService.getAll(name);
    }

    @GetMapping("/innerjoin")
    public List<AcademyResponseDto> allSt(AcademyResponseDto dto) {
        log.info("null olanlar gelmedi",dto);
        return studentService.all();
    }
}

