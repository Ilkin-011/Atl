package com.atl.otpservice.bankpayment.service.Impl;


import com.atl.otpservice.bankpayment.dao.repository.PaymentRepository;
import com.atl.otpservice.bankpayment.dto.PaymentResponseDto;
import com.atl.otpservice.bankpayment.dto.RedisStatusResponse;
import com.atl.otpservice.bankpayment.exception.RedisKeyNotFoundException;
import com.atl.otpservice.bankpayment.mapper.PaymentMapper;
import com.atl.otpservice.bankpayment.util.enums.RedisStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;
@Slf4j
@Service
@RequiredArgsConstructor

public class RedisService {
    private final RedisTemplate<String, List<PaymentResponseDto>> redisTemplate;
    private final PaymentMapper paymentMapper;
    private final PaymentRepository repository;

    public void saveToCache(String key, List<PaymentResponseDto> data, Long timeOutMinutes) {
        redisTemplate.opsForValue().set(key, data, timeOutMinutes, TimeUnit.MINUTES);
    }

    public List<PaymentResponseDto> getFromCache(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public RedisStatusResponse deleteCache(String key) {
        if (redisTemplate.delete(key)) {
            redisTemplate.delete(key);
            return new RedisStatusResponse(RedisStatus.SUCCESS, "key OK,information delete");
        } else {
            throw new RedisKeyNotFoundException("key not found,information not delete");
        }
    }

    public List<PaymentResponseDto> getALLUsers(String key) {
        List<PaymentResponseDto> cacheData = getFromCache(key);
        if (cacheData != null) {
            return cacheData;
        }
        List<PaymentResponseDto> dBData = paymentMapper.entityToListDto(repository.findAll());
        saveToCache(key, dBData, 10L);
         log.warn("info save to database");
         return dBData;

    }

}
