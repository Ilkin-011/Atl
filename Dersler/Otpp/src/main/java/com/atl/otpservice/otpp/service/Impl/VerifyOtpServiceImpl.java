package com.atl.otpservice.otpp.service.Impl;

import com.atl.otpservice.otpp.dao.entity.OtpEntity;
import com.atl.otpservice.otpp.dao.repository.OtpRepository;
import com.atl.otpservice.otpp.rest.SendOtpResponse;
import com.atl.otpservice.otpp.rest.VerifyOtpRequest;
import com.atl.otpservice.otpp.service.VerifyOtpService;
import com.atl.otpservice.otpp.util.enums.OtpStatus;
import com.atl.otpservice.otpp.util.helper.ServiceHelperOtp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VerifyOtpServiceImpl implements VerifyOtpService {
    private final OtpRepository repository;
    private final ServiceHelperOtp serviceHelperOtp;

    public SendOtpResponse verifyOtp(VerifyOtpRequest request) {
        Optional<OtpEntity> entity = repository.findByMsisdn(request.msisdn());
        if (entity.isPresent()) {
            OtpEntity otpData = entity.get();
            if (otpData.getStatus().equals(OtpStatus.BLOCKED) && otpData.getBlockedTime().isAfter(LocalDateTime.now())) {
                return new SendOtpResponse(OtpStatus.BLOCKED, null, otpData.getBlockedTime());
            }

            if (otpData.getStatus().equals(OtpStatus.BLOCKED) && otpData.getBlockedTime().isBefore(LocalDateTime.now())) {
                serviceHelperOtp.removeOtp(otpData.getMsisdn());
                return new SendOtpResponse(OtpStatus.EXPIRE, null, null);
            }
            if (otpData.getExpiredTime().isBefore(LocalDateTime.now())) {
                return new SendOtpResponse(OtpStatus.EXPIRE, null, null);
            }
            if (otpData.getOtpCode().equals(request.otpCode())) {
                serviceHelperOtp.removeOtp(otpData.getMsisdn());
                return new SendOtpResponse(OtpStatus.SUCCES, null, null);
            } else {
                int verifyCount = Optional.ofNullable(otpData.getVerifyCount()).orElse(0) + 1;
                var blockTime = LocalDateTime.now().plusMinutes(5);
                if (verifyCount >= 5) {
                    otpData.setStatus(OtpStatus.BLOCKED);
                    otpData.setBlockedTime(blockTime);
                    otpData.setVerifyCount(verifyCount);
                    otpData.setExpiredTime(null);
                    repository.save(otpData);
                    return new SendOtpResponse(OtpStatus.BLOCKED, null, blockTime);
                } else {
                    otpData.setStatus(OtpStatus.FAIL);
                    otpData.setVerifyCount(verifyCount);
                    repository.save(otpData);
                    return new SendOtpResponse(OtpStatus.FAIL, null, null);
                }
            }
        } else {
            return new SendOtpResponse(OtpStatus.NOT_FOUND, null, null);
        }
    }
}

