package com.atl.product.repository;

import com.atl.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
@Modifying
    @Query(value = "update product_entity set price = :price where id= :id",nativeQuery = true)
    void updatePrice(@Param("price") double price, @Param("id") Long id);


    @Query(value = "SELECT * from product_entity ", nativeQuery = true)
    List<ProductEntity> findAllTable(@Param("name")String name);


    @Query(value = "select * from product_entity where id >=:id",nativeQuery = true)
         void getir(@Param("price")double price);
}


