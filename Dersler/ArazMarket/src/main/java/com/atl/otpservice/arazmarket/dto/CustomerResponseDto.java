package com.atl.otpservice.arazmarket.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.math.BigDecimal;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponseDto {
    String fullName;
    Integer age;
    BigDecimal balance;
}
