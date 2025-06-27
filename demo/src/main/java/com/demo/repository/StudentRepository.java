package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
