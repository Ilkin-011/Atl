package com.atl.otpservice.bankpayment.dto;

import com.atl.otpservice.bankpayment.util.annotation.MinBalance;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
@Component
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class TransferRequestDto {
    Integer transferRequestCount;
    @JsonProperty("sender")
    String senderAccount;
    @JsonProperty("receiver")
    String receiverAccount;
    @MinBalance
    BigDecimal balance;
}
