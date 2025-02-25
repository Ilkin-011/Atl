package com.atl.otpservice.otpp.rest;

import com.atl.otpservice.otpp.util.enums.OtpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

public record SendOtpResponse(
        OtpStatus status, @JsonInclude(JsonInclude.Include.NON_NULL)LocalDateTime expireTime,
        @JsonInclude(JsonInclude.Include.NON_NULL)LocalDateTime blockTime
        ) {
}
