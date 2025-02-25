package com.atl.otpservice.bankpayment.service;

import com.atl.otpservice.bankpayment.dto.PaymentRequestDto;
import com.atl.otpservice.bankpayment.dto.TransferRequestDto;
import com.atl.otpservice.bankpayment.dto.StatusResponseDto;

public interface PaymentService {
    StatusResponseDto transferBalance(TransferRequestDto dto);
    void addUser(PaymentRequestDto dto);
}
