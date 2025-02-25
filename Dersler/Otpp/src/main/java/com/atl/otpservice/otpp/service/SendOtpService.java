package com.atl.otpservice.otpp.service;

import com.atl.otpservice.otpp.rest.SendOtpRequest;
import com.atl.otpservice.otpp.rest.SendOtpResponse;

public interface SendOtpService {
    SendOtpResponse sendOtpService(SendOtpRequest request);
}
