package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public Student studentService(Long stuId) {
		
		Optional<Student> stu = studentRepository.findById(stuId);
		if(stu.isPresent()) {
			return stu.get();
		}else {
			return null;
		}
	}

	public List<Student> allStudentService() {
	    List<Student> students = studentRepository.findAll();
	    List<Student> processedStudents = new ArrayList<>();

	    for (Student student : students) {
	        processedStudents.add(student);
	    }

	    return processedStudents;
	}

	

	public Integer updateNativeQuery(Long studentId, String branch) {
		Integer stu =studentRepository.updateStudentBranch(studentId,branch);
		return stu;
	}
	
	public Student updateById(Long stuId, Student student) {
		Optional<Student> existingStudentDetails= studentRepository.findById(stuId);
		Student existingStudentDetail = existingStudentDetails.get();
		existingStudentDetail.setStuBrach(student.getStuBrach());
		existingStudentDetail.setStuName(student.getStuName());
		return studentRepository.save(existingStudentDetail);
	}

	public void deleteStudent(Long stuId) {
		studentRepository.deleteById(stuId);
		
	}

}
