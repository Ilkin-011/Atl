package com.atl.bankapp.mapper;

import com.atl.bankapp.dao.BankEntity;
import com.atl.bankapp.dao.BankRepository;
import com.atl.bankapp.dao.UserEntity;
import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.dto.UserResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@Component
public class BankMapper {
    private final BankRepository repository;
    public BankResponseDto  entityToLIstDto(Long id ) {
        BankEntity entity=repository.findById(id).orElseThrow(()->new RuntimeException("not found"));

        List<UserEntity>entities1=entity.getUserEntities();
        List<UserResponseDto>dtos=new ArrayList<>();
        for (UserEntity e:entities1){
            dtos.add(UserResponseDto.builder().fame(e.getFame()).lname(e.getLname()).build());
        }
        return BankResponseDto.builder().bankName(entity.getBankName()).userEntities(dtos).build();
    }

}
