package com.vb.crud.service;

import com.vb.crud.entity.Student;

import java.util.List;

public interface StudentService {
	
	//save new student
	public Student saveStudent(Student student);
		
	
//get all Students
public List<Student> findAllStudents(); 

}
