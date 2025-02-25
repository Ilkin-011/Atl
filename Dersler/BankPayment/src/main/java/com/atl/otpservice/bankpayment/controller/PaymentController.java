package com.atl.otpservice.bankpayment.controller;

import com.atl.otpservice.bankpayment.dto.*;
import com.atl.otpservice.bankpayment.service.Impl.RedisService;
import com.atl.otpservice.bankpayment.service.PaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v2/payment")
public class PaymentController {
    private final PaymentService service;
    private final RedisService redisService;

    @PostMapping("transfer-balance")
    public StatusResponseDto paymentTransfer(@Valid @RequestBody TransferRequestDto dto) {
        return service.transferBalance(dto);

    }

    @PostMapping("/post")
    public void postUser(@Valid @RequestBody PaymentRequestDto dto) {
        service.addUser(dto);
    }

    @GetMapping("/get")
    public List<PaymentResponseDto> getData() {
        return redisService.getALLUsers("users");
    }

    @DeleteMapping("/delete-cache")
    public RedisStatusResponse deleteCache(@Param("key") String key){
        return redisService.deleteCache(key);
    }
//    @PostMapping("/publish")
//    public
}
