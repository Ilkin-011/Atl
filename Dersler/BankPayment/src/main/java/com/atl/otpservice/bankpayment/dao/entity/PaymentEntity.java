package com.atl.otpservice.bankpayment.dao.entity;

import com.atl.otpservice.bankpayment.util.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surName;
    @Column(unique = true,nullable = false)
    private String accountNumber;
    private BigDecimal balance;
    private Integer transferRequestCount=0;
    @Builder.Default
    private LocalDateTime blockTime=LocalDateTime.now();
    private PaymentStatus status;
}
