package com.atl.bankapp.service;

import com.atl.bankapp.dto.UserRequestDto;
import com.atl.bankapp.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    void addUser(UserRequestDto dto);
    UserRequestDto updateUser(UserRequestDto dto,Long id);
    void  deleteUser(Long id);
   List<UserResponseDto> findAllUser();
   UserResponseDto findByIdUser(Long id);

}
