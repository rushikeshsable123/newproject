package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService sr;

	@PostMapping("/add")
	public Student addstudent(@PathVariable Student s)
	{
		Student stu =sr.save(s);
		return stu;
		
	}
}
