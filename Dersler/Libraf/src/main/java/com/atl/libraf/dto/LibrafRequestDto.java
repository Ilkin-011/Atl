package com.atl.libraf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LibrafRequestDto {
    private String bookName;
    private String category;
    private Long stock;
}
