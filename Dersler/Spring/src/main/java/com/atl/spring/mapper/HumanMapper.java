package com.atl.spring.mapper;

import com.atl.spring.dto.HumanResponseDto;
import com.atl.spring.entity.HumanEntity;
import jdk.jfr.BooleanFlag;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Builder
public class HumanMapper {
    public List<HumanResponseDto>entityListToDto(List<HumanEntity>entities){
        List<HumanResponseDto>dto=new ArrayList<>();
        for (HumanEntity entity:entities){
            var a=HumanResponseDto.builder().firstName(entity.getFirstName()).lastName(entity.getLastName()).build();
            dto.add(a);
        }
        return dto;
    }

}
