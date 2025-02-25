package com.atl.bankapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {
    private String fame;
    private String lname;
    @JsonProperty("bank_id")
    private Long BankId;
}
