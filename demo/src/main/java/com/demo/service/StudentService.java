package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;


@Service
public class StudentService {
	@Autowired
   StudentRepository studentRepository; 
	
	public Student insertStudent(Student student) {
		return studentRepository.save(student);
	}

}
