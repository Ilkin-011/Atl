package com.atl.book.mapper;

import com.atl.book.dto.AliVeNinoResponseDto;
import com.atl.book.dto.BookResponseDto;
import com.atl.book.dto.LibrafResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class BookMapper {
    public List<BookResponseDto>aliVeNinoDtoToLibrafDto(List<AliVeNinoResponseDto> dto){
    var dtos=new ArrayList<BookResponseDto>();
    for (AliVeNinoResponseDto a:dto){
        dtos.add(
                BookResponseDto.builder().Bookname(a.getName()).price(a.getPrice()).stock(a.getStock()).build()
        );
    }
    return dtos;
    }
    public List<BookResponseDto>librafDtoToListToBookDto(List<LibrafResponseDto> dto){
        var dtos=new ArrayList<BookResponseDto>();
        for (LibrafResponseDto a:dto){
            dtos.add(
                    BookResponseDto.builder().Bookname(a.getName()).price(a.getPrice()).stock(a.getStock()).build()
            );
        }
        return dtos;
    }
    public Map<String ,List<BookResponseDto>> categoryTheBook(List<LibrafResponseDto>l,List<AliVeNinoResponseDto>a){
        Map<String ,List<BookResponseDto>>categoryTheBook=new HashMap<>();
        categoryTheBook.put("libraff shop",librafDtoToListToBookDto(l));
        categoryTheBook.put("ali ve nino  shop",aliVeNinoDtoToLibrafDto(a));
        return categoryTheBook;
    }
}
