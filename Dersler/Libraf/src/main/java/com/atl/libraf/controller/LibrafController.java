package com.atl.libraf.controller;

import com.atl.libraf.dao.repostiroy.LibrafRepository;
import com.atl.libraf.dto.LibrafRequestDto;
import com.atl.libraf.dto.LibrafResponseDto;
import com.atl.libraf.service.LibrafService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/libraf")
public class LibrafController {
    private final LibrafService librafService ;
    @GetMapping("{id}")
    public LibrafResponseDto getLibraf(@PathVariable Long id)throws Exception{
        return librafService.librafGetById(id);
    }
    @PostMapping("/post")
    public void createLibraf(@RequestBody LibrafRequestDto dto){
        librafService.addLibraf(dto);
    }
    @GetMapping
    public List<LibrafResponseDto>getAllLibraf(){
        return librafService.getAllLibraf();
    }
    @DeleteMapping("{id}")
    public void deleteLibraf(@PathVariable Long id){
        librafService.deleteLibrafById(id);
    }
    @PutMapping("{id}")
    public void updateLibraf(@PathVariable Long id,@RequestBody LibrafRequestDto dto){
        librafService.updateLibraf(dto, id);
    }
}
