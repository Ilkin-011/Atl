package com.atl.bankapp.controller;

import com.atl.bankapp.dto.UserRequestDto;
import com.atl.bankapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private  final UserService userService;
    @PostMapping("/add")
    public void addUser(@RequestBody UserRequestDto dto){
        userService.addUser(dto);
    }
}
