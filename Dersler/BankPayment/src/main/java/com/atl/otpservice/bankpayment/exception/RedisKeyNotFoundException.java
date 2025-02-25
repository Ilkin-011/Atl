package com.atl.otpservice.bankpayment.exception;

public class RedisKeyNotFoundException extends RuntimeException {
    public RedisKeyNotFoundException(String message) {
        super(message);
    }
}
