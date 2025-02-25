package com.atl.otpservice.otpp.dao.repository;

import com.atl.otpservice.otpp.dao.entity.OtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<OtpEntity,Long> {
    Optional<OtpEntity>findByMsisdn(String msisdn);
}
