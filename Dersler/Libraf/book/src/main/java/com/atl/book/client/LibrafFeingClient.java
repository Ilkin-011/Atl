package com.atl.book.client;


import com.atl.book.dto.LibrafResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "libraf-client" , url = "http://194.105.5.229:8800/api/v1/libraf")
public interface LibrafFeingClient {

    @RequestMapping(method = RequestMethod.GET,value = "/get")
    List<LibrafResponseDto> getBooksZovqeGOreVerilmishAd();
//    @RequestMapping(method = RequestMethod.POST, value = "/post")
//    void post(LibrafClientDto dto);
}

