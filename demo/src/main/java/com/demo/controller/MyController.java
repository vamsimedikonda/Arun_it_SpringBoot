package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class MyController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/displaydata")
	public String display() {
		
		return "First application Arun it solutions";
		
	}
	
	@PostMapping("/insertstudentdata")
	public ResponseEntity<Student> insertStudent(@RequestBody Student student){
		Student stu = studentService.insertStudent(student);
		return new ResponseEntity<>(stu,HttpStatus.CREATED);
	}
}
