package com.atl.otpservice.bankpayment.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
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

public class PaymentRequestDto {
    @Size(max = 10,message = "ad min 10 simvol ")
    String name;
    String surname;
    @Min(value = 0,message = "min balance 0")
    BigDecimal balance;
}
