package com.atl.otpservice.bankpayment.exception;

public class BlockAccountException extends RuntimeException {
    public BlockAccountException(String message) {
        super(message);
    }
}
