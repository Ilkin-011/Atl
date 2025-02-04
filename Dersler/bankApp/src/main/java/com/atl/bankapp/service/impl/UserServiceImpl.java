package com.atl.bankapp.service.impl;

import com.atl.bankapp.dao.entity.BankEntity;
import com.atl.bankapp.dao.entity.UserEntity;
import com.atl.bankapp.dao.repository.BankRepository;
import com.atl.bankapp.dao.repository.UserRepository;
import com.atl.bankapp.dto.UserRequestDto;
import com.atl.bankapp.dto.UserResponseDto;
import com.atl.bankapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
 private final UserRepository userRepository;
 private final BankRepository bankRepository;
    @Override
    public void addUser(UserRequestDto dto) {
        BankEntity bankEntity=bankRepository.findById(dto.getBankId()).orElseThrow(()->new RuntimeException());
        UserEntity entity=UserEntity.builder()
                .fame(dto.getFame())
                .lname(dto.getLname())
                .bankEntity(bankEntity)
                .build();
        userRepository.save(entity);
    }

    @Override
    public UserRequestDto updateUser(UserRequestDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public List<UserResponseDto> findAllUser() {
        return List.of();
    }

    @Override
    public UserResponseDto findByIdUser(Long id) {
        return null;
    }
}
