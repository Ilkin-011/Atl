package com.atl.entrance.dao.repository;

import com.atl.entrance.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <StudentEntity,Long> {
}
