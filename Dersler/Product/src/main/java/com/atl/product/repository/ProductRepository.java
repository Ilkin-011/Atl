package com.atl.product.repository;

import com.atl.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository <ProductEntity,Long> {
}
