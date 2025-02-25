package com.atl.otpservice.bankpayment.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponseDto {
    String name;
    String surname;
    BigDecimal balance;
}
