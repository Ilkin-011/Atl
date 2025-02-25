package com.atl.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class AcademyResponseDto {
    private String academyName;
    private String studentName;
    private String studentSurname;
}
