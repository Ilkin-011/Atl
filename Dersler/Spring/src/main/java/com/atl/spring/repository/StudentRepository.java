package com.atl.spring.repository;

import com.atl.spring.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    @Modifying
    @Query(value = "update telebeler set name = :name where id= :id",nativeQuery = true)
    void updateName(@Param("name") String name, @Param("id") Long id);
    @Query(value = "select * from telebeler where name = :name",nativeQuery = true)
    List<StudentEntity> getir(@Param("name") String name);
}
