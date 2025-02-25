package com.atl.otpservice.bankpayment.dto;

import com.atl.otpservice.bankpayment.util.enums.RedisStatus;

public record RedisStatusResponse (RedisStatus status,String message){
}
