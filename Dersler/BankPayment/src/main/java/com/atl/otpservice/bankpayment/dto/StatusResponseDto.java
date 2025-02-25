package com.atl.otpservice.bankpayment.dto;

import com.atl.otpservice.bankpayment.util.enums.PaymentStatus;

public record StatusResponseDto(PaymentStatus status,String message){

}
