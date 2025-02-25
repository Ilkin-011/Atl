package com.atl.book.client;

import com.atl.book.dto.AliVeNinoResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "alivenino-client", url = "http://194.105.5.229:8801/api/v1/alivenino/")
public interface AliVeNinoFeingClient {

    @RequestMapping(method = RequestMethod.GET,value = "/get")
    List<AliVeNinoResponseDto> getBooksZovqeGOreVerilmishAd();
}
