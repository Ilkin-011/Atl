package com.atl.otpservice.otpp.util.helper;

import com.atl.otpservice.otpp.dao.entity.OtpEntity;
import com.atl.otpservice.otpp.dao.repository.OtpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ServiceHelperOtp {
 private final OtpRepository otpRepository;
 public void removeOtp(String msisdn){
     Optional<OtpEntity>entity=otpRepository.findByMsisdn(msisdn);
     otpRepository.delete(entity.get());
 }
}
