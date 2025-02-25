package com.atl.bankapp.mapper;

import com.atl.bankapp.dao.entity.BankEntity;
import com.atl.bankapp.dao.repository.BankRepository;
import com.atl.bankapp.dao.entity.UserEntity;
import com.atl.bankapp.dto.BankResponseDto;
import com.atl.bankapp.dto.UserResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Component
public class BankMapper {
    private final BankRepository repository;

    public BankResponseDto entityToLIstDto(Long id) {
        BankEntity entity = repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));

        List<UserEntity> entities1 = entity.getUserEntities();
        List<UserResponseDto> dtos = new ArrayList<>();
        for (UserEntity e : entities1) {
            dtos.add(UserResponseDto.builder().fame(e.getFame()).lname(e.getLname()).build());
        }
        return BankResponseDto.builder().bankName(entity.getBankName()).userEntities(dtos).build();
    }

    public List<BankResponseDto> entityListToDtos(List<BankEntity> bankEntities) {
        List<BankResponseDto> bankDtos = new ArrayList<>();
        for (BankEntity bank : bankEntities) {
            List<UserResponseDto> userDtos = new ArrayList<>();
            for (UserEntity user : bank.getUserEntities()) {
                UserResponseDto userResponseDto = UserResponseDto.builder().fame(user.getFame()).lname(user.getLname()).build();
                userDtos.add(userResponseDto);
            }
            BankResponseDto bankDto = BankResponseDto.builder().bankName(bank.getBankName()).userEntities(userDtos).build();
            bankDtos.add(bankDto);
        }
        return bankDtos;
    }
}