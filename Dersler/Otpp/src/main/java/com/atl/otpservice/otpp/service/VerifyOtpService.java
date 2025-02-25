package com.atl.otpservice.otpp.service;

import com.atl.otpservice.otpp.rest.SendOtpResponse;
import com.atl.otpservice.otpp.rest.VerifyOtpRequest;

public interface VerifyOtpService {
    SendOtpResponse verifyOtp(VerifyOtpRequest verifyOtpRequest);
}
