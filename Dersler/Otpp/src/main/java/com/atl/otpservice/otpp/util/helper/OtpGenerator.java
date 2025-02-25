package com.atl.otpservice.otpp.util.helper;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class OtpGenerator {
    public String generate(){
        SecureRandom random =new SecureRandom();
        var otpCode=random.nextInt(100000);
        return String.format("%06d",otpCode);
    }
}
