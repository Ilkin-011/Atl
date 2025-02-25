package com.atl.otpservice.bankpayment.exception;

public class BankEnoughFundsException extends RuntimeException {
  public BankEnoughFundsException(String message) {
    super(message);
  }
}
