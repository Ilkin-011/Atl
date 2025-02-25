package com.atl.spring.repository;

import com.atl.spring.dto.AcademyResponseDto;
import com.atl.spring.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    @Modifying
    @Query(value = "update telebeler set name = :name where id= :id",nativeQuery = true)
    void updateName(@Param("name") String name, @Param("id") Long id);
    @Query(value = "select * from telebeler where name = :name",nativeQuery = true)
    List<StudentEntity> getir(@Param("name") String name);

    @Query(value = "select a.name as studentName,t.name as academyName,t.surname as studentSurname from telebeler t" +
            " left join academy a on a.id = t.academy_id;", nativeQuery = true)
    List<AcademyResponseDto>academy();
@Query(value = "select a.name as studentName,t.name as academyName,t.surname as studentSurname from telebeler t " +
        "inner join academy a on a.id=t.academy_id",nativeQuery = true)
    List<AcademyResponseDto>all();

}
