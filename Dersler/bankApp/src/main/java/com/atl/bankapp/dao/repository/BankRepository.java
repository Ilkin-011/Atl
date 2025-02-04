package com.atl.bankapp.dao.repository;

import com.atl.bankapp.dao.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankEntity,Long> {
}
