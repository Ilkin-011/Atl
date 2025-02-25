package com.atl.otpservice.otpp.rest;

import com.atl.otpservice.otpp.service.SendOtpService;
import com.atl.otpservice.otpp.service.VerifyOtpService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/otp")
public class OtpController {
    private final SendOtpService otpService;
    private final VerifyOtpService verifyOtpService;
    @PostMapping
    public SendOtpResponse sms(@RequestBody SendOtpRequest request){
       return otpService.sendOtpService(request);
    }
    @PostMapping("verify")
    public SendOtpResponse verifyOtp(@RequestBody VerifyOtpRequest request){
        return verifyOtpService.verifyOtp(request);
    }
}
