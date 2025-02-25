package com.atl.spring.controller;

import com.atl.spring.dto.HumanRequestDto;
import com.atl.spring.dto.HumanResponseDto;
import com.atl.spring.dto.HumanUpdateDto;
import com.atl.spring.entity.HumanEntity;
import com.atl.spring.service.HumanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("human")
public class HumanController {
    private final HumanService service;
    @GetMapping("/gets")
    public List<HumanResponseDto>getAll(){
        return service.getHuman();
    }
    @PostMapping("posts")
    public void postMan(@RequestBody HumanRequestDto dto){
         service.getAll(dto);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteHuman(@PathVariable Long id){
        service.delete(id);
    }
    @PutMapping("edit/{id}")
    public HumanUpdateDto edit(Long id, HumanUpdateDto dto){
        return service.edit(id,dto);
    }
}
