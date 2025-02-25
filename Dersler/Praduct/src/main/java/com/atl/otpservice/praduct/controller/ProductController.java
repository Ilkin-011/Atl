package com.atl.otpservice.praduct.controller;

import com.atl.otpservice.praduct.dto.ProductDto;
import com.atl.otpservice.praduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping()
    void add(@RequestBody ProductDto dto) {
        service.createProduct(dto);

    }

    @GetMapping("{id}")
    ProductDto getAll(@PathVariable Long id) {
        return service.findById(id);
    }
    @PutMapping("/{id}")
    void updateProduct(@PathVariable Long id,@RequestBody ProductDto dto){
        service.updateProduct(id,dto);
    }
}
