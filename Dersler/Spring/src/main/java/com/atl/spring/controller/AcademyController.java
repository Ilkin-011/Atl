package com.atl.spring.controller;

import com.atl.spring.dto.AcademyResponseDto;
import com.atl.spring.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/academy")
public class AcademyController {
    private final StudentRepository repository;

    @GetMapping("/join")
    public List<AcademyResponseDto> getAcademy() {
        return repository.academy();
    }

}
