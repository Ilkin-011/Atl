package com.atl.otpservice.otpp.service.Impl;

import com.atl.otpservice.otpp.client.SmsClient;
import com.atl.otpservice.otpp.dao.entity.OtpEntity;
import com.atl.otpservice.otpp.dao.repository.OtpRepository;
import com.atl.otpservice.otpp.rest.SendOtpRequest;
import com.atl.otpservice.otpp.rest.SendOtpResponse;
import com.atl.otpservice.otpp.service.SendOtpService;
import com.atl.otpservice.otpp.util.enums.OtpStatus;
import com.atl.otpservice.otpp.util.helper.OtpGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SendOtpServiceImpl implements SendOtpService {
    private final OtpRepository repository;
    private final OtpGenerator generator;
    private final SmsClient smsClient;

    @Override
    public SendOtpResponse sendOtpService(SendOtpRequest request) {
        var otpData = repository.findByMsisdn(request.msisdn());
        if (otpData.isPresent()) {
            OtpEntity entity = otpData.get();
            if (entity.getStatus().equals(OtpStatus.BLOCKED)) {
                if (entity.getBlockedTime().isAfter(LocalDateTime.now())) {
                    return sendOtpResponse(entity);

                } else {
                    removeFromBlock(request.msisdn());
                    OtpEntity entity1 = sendFirstTime(request.msisdn());
                    return sendOtpResponse(entity1);
                }
            } else {
                if (entity.getSmsCount() >= 5) {
                    entity.setStatus(OtpStatus.BLOCKED);
                    entity.setExpiredTime(null);
                    entity.setBlockedTime(LocalDateTime.now().plusMinutes(5));
                    var otpEntity = repository.save(entity);
                    return sendOtpResponse(otpEntity);
                } else {
                    return ordinarySendOtp(entity);
                }
            }
        } else {
            //first time otp code sms
            OtpEntity entity = sendFirstTime(request.msisdn());
            smsClient.sendSms(request.msisdn(), entity.getOtpCode());
            return sendOtpResponse(entity);
        }
    }

    private SendOtpResponse sendOtpResponse(OtpEntity otpEntity) {
        return new SendOtpResponse(otpEntity.getStatus(), otpEntity.getExpiredTime(), otpEntity.getBlockedTime());
    }

    private void removeFromBlock(String msisdn) {
        OtpEntity entity = repository.findByMsisdn(msisdn).get();
        repository.delete(entity);
    }

    private OtpEntity sendFirstTime(String msisdn) {
        String code = generator.generate();
        OtpEntity entity = OtpEntity.builder()
                .otpCode(code)
                .msisdn(msisdn)
                .smsCount(1)
                .status(OtpStatus.PENDING)
                .expiredTime(LocalDateTime.now().plusMinutes(5))
                .build();
        return repository.save(entity);
    }

    private SendOtpResponse ordinarySendOtp(OtpEntity otpData) {
        otpData.setSmsCount(otpData.getSmsCount() + 1);
        otpData.setStatus(OtpStatus.PENDING);
        otpData.setOtpCode(generator.generate());
        OtpEntity entity = repository.save(otpData);
        smsClient.sendSms(entity.getMsisdn(), otpData.getOtpCode());
        return sendOtpResponse(entity);
    }
}
