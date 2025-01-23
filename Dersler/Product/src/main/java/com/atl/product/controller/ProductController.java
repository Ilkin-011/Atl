package com.atl.product.controller;

import com.atl.product.dto.ProductRequestDto;
import com.atl.product.dto.ProductResponseDto;
import com.atl.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/post")
    public void addProduct(@RequestBody ProductRequestDto dto) {
        productService.addProduct(dto);
    }
    @GetMapping("/get")
    public List<ProductResponseDto>getProduct(){
    return productService.getProduct();
    }
    @GetMapping("{id}")
    public ProductResponseDto dto(@PathVariable Long id ){
        return productService.getById(id);
    }
    @PostMapping("/update/{id}")
    public ProductRequestDto update(@RequestBody ProductRequestDto dto, @PathVariable Long id){
        return productService.updateProduct(dto,id);
    }
}
