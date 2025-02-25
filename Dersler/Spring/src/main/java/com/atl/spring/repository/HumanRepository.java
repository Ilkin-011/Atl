package com.atl.spring.repository;

import com.atl.spring.entity.HumanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends JpaRepository<HumanEntity,Long> {
}
