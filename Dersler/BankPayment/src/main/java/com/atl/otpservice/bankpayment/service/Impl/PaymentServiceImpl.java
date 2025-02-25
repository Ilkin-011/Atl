package com.atl.otpservice.bankpayment.service.Impl;

import com.atl.otpservice.bankpayment.dao.entity.PaymentEntity;
import com.atl.otpservice.bankpayment.dao.repository.PaymentRepository;
import com.atl.otpservice.bankpayment.dto.PaymentRequestDto;
import com.atl.otpservice.bankpayment.dto.TransferRequestDto;
import com.atl.otpservice.bankpayment.dto.StatusResponseDto;
import com.atl.otpservice.bankpayment.exception.BalanceNotEnough;
import com.atl.otpservice.bankpayment.exception.ErrorTransferException;
import com.atl.otpservice.bankpayment.exception.UserNotFoundException;
import com.atl.otpservice.bankpayment.service.PaymentService;
import com.atl.otpservice.bankpayment.util.enums.PaymentStatus;
import com.atl.otpservice.bankpayment.util.helper.AccountNumberGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository repository;
    private final AccountNumberGenerator generator;


    @Override
    @Transactional
    public StatusResponseDto transferBalance(TransferRequestDto dto) {
        var sender = repository.findByAccountNumber(dto.getSenderAccount());
        var receiver = repository.findByAccountNumber(dto.getReceiverAccount());
        if (sender.isPresent() && receiver.isPresent()) {
            PaymentEntity senderData = sender.get();
            PaymentEntity receiverData = receiver.get();
        /*
        yoxluyuruq databasedeki balans requestden gelen
        balansdan boyuk ya beraberdise true,kicikdirse false
         */
            log.info("hesab tapildi");
            if (senderData.getBlockTime().isAfter(LocalDateTime.now())){
                if (senderData.getTransferRequestCount()>=5){
        senderData.setBlockTime(LocalDateTime.now());
        senderData.setTransferRequestCount(dto.getTransferRequestCount());
        senderData.setStatus(PaymentStatus.BLOCK);
        repository.save(senderData);
                }else {
                    senderData.getStatus();
                }
            }
            if (!senderData.getAccountNumber().equals(receiverData.getAccountNumber())) {
                if (senderData.getBalance().compareTo(dto.getBalance()) >= 0) {
                    senderData.setBalance(senderData.getBalance().subtract(dto.getBalance()));
                    receiverData.setBalance(receiverData.getBalance().add(dto.getBalance()));
                    senderData.setTransferRequestCount(senderData.getTransferRequestCount());

                    repository.save(senderData);
                    repository.save(receiverData);
                    log.warn("gonderildi");
                    return new StatusResponseDto(PaymentStatus.SUCCESS, "ugurlu");
                } else {
                    senderData.setTransferRequestCount(senderData.getTransferRequestCount()+1);
                    repository.save(senderData);
                    throw new BalanceNotEnough("pulunuz yoxdu");
                }

            } else {
                senderData.setTransferRequestCount(senderData.getTransferRequestCount()+1);
                var a =TransferRequestDto.builder().transferRequestCount(dto.getTransferRequestCount());
                throw new ErrorTransferException("oz balansiniza pul transfer ede bilmezsiniz");
            }
        } else {
            throw new UserNotFoundException("hesab tapilmadi");
        }
    }

    @Override
    public void addUser(PaymentRequestDto dto) {
        boolean isSaved = false;
        int count = 0;
        while (!isSaved) {
            try {
                ++count;
                String accountNumber = generator.codeGenerator();
                var entity = PaymentEntity.builder().name(dto.getName())
                        .surName(dto.getSurname())
                        .accountNumber(accountNumber)
                        .balance(dto.getBalance()).build();

                repository.save(entity);
                return;
            } catch (DataIntegrityViolationException ex) {
                if (count >= 10) {
                    throw new UserNotFoundException("hesab yaradila bilmez");
                }


            }

        }

    }

}