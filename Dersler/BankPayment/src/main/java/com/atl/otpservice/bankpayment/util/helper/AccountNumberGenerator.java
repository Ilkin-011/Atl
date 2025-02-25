package com.atl.otpservice.bankpayment.util.helper;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class AccountNumberGenerator {
    public String codeGenerator(){
        SecureRandom random=new SecureRandom();
      var otp =  random.nextLong(1,3);
        return  String.format("AZ%09d",otp);
    }

}
