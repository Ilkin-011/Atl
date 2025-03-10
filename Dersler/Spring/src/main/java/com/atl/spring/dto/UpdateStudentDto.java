package com.atl.spring.dto;

import com.atl.spring.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class UpdateStudentDto {
    private String name;
    private String Surname;
    private Gender gender;
}
