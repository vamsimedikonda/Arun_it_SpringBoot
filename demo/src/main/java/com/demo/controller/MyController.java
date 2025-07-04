package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private String appVersion;
	
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
	
	@GetMapping("/stdentdetails/{stuId}")
	public  ResponseEntity<Student> studentDetails(@PathVariable("stuId") long stuId) {
		
		System.out.println("appName :" + appName);
		System.out.println("appVersion :" + appVersion);
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
	
	@PutMapping("/updateNativeQuery")
	public ResponseEntity<Integer> updateNativeQuery(@RequestParam Long studentId,@RequestParam String branch ){
		Integer stu= studentService.updateNativeQuery(studentId,branch);
		
		return new ResponseEntity<>(stu,HttpStatus.FOUND);
		
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam Long stuId) {
		studentService.deleteStudent(stuId);
	}
	
	

}
