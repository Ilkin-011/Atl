package com.atl.otpservice.bankpayment.exception;

public class ErrorTransferException extends RuntimeException {
    public ErrorTransferException(String message) {
        super(message);
    }
}
