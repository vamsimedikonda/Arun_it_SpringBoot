package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/stdentdetails")
	public  ResponseEntity<Student> studentDetails(@RequestParam long stuId) {
		Student stu= studentService.studentService(stuId);
		return new ResponseEntity<>(stu,HttpStatus.FOUND);
		
	}
	
	@GetMapping("/allstdentdetails")
	public  ResponseEntity<List<Student>> studentDetails() {
		List<Student> stu= studentService.allStudentService();
		return new ResponseEntity<>(stu,HttpStatus.FOUND);
		
	}
	
	@PutMapping("/updateById")
	public ResponseEntity<Student> updateById(@RequestParam Long StuId,@RequestBody Student student){
		Student stu= studentService.updateById(StuId,student);
		
		return new ResponseEntity<>(stu,HttpStatus.FOUND);
		
	}
}
