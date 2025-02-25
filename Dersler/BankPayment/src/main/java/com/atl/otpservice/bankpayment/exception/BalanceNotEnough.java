package com.atl.otpservice.bankpayment.exception;

public class BalanceNotEnough extends RuntimeException {
    public BalanceNotEnough(String message) {
        super(message);
    }
}
