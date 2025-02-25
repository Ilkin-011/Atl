package com.atl.fruit.dao.repository;

import com.atl.fruit.dao.entity.FruitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<FruitEntity,Long>{
}
