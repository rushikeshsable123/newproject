package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repo.StudentRepository;
import com.service.StudentService;

@Service
public class StudentServiveIMPL implements StudentService {

	@Autowired
	StudentRepository str;
	
	@Override
	public Student save(Student s) {

		Student stu1=str.save(s);
		return stu1;
	}

}
