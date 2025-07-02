package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

import jakarta.transaction.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Modifying
	@Transactional
	@Query(value = "UPDATE student SET stu_brach = :branch WHERE stu_id = :studentId", nativeQuery = true)
	int updateStudentBranch(@Param("studentId") Long studentId, @Param("branch") String branch);

}
