package com.atl.otpservice.praduct.service.productServiceImpl;

import com.atl.otpservice.praduct.dao.repository.ProductRepository;
import com.atl.otpservice.praduct.dto.ProductDto;
import com.atl.otpservice.praduct.exception.ProductNotFoundException;
import com.atl.otpservice.praduct.mapper.ProductMapper;
import com.atl.otpservice.praduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductMapper mapper;
    private final ProductRepository repository;

    @Override
    public void createProduct(ProductDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public ProductDto findById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(()->new ProductNotFoundException ("product not found")));
    }

    @Override
    public void updateProduct(Long id, ProductDto dto) {
      var entity=  repository.findById(id).orElseThrow(()->new ProductNotFoundException ("product not found"));
      entity.setName(dto.getName());
      entity.setCount(dto.getCount());
      entity.setCount(dto.getCount());
      repository.save(entity);
    }

    @Override
    public void increaseCount(Long id, Integer count) {

    }

    @Override
    public void deleteProduct(long id) {

    }

    @Override
    public void decreaseCount(Long productId, Integer count) {

    }
}
