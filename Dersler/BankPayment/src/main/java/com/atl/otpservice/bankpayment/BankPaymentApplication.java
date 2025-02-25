package com.atl.otpservice.bankpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class BankPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankPaymentApplication.class, args);
    }

}
