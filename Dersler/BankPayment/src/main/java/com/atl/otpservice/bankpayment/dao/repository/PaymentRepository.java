package com.atl.otpservice.bankpayment.dao.repository;

import com.atl.otpservice.bankpayment.dao.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    Optional<PaymentEntity> findByAccountNumber(String accountNumber);
}
