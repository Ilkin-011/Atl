package com.atl.spring.dto;

import com.atl.spring.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRequestDto {
    private String name;
    private String surname;
    private Gender gender;
}
