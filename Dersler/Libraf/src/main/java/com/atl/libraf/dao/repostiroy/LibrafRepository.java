package com.atl.libraf.dao.repostiroy;

import com.atl.libraf.dao.entity.LibrafEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrafRepository extends JpaRepository<LibrafEntity,Long> {
}
