package com.atl.otpservice.praduct.dao.repository;

import com.atl.otpservice.praduct.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
