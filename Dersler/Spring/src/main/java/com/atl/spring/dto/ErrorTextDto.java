package com.atl.spring.dto;

import com.atl.spring.util.ResponseStatuss;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ErrorTextDto {
    private ResponseStatuss status;
    private String message;
}
