package com.vb.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vb.crud.repository.StudentRepository;
import com.vb.crud.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	
@Autowired
private StudentRepository studentRepo;

	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	
	@Override
	public List<Student> findAllStudents(){
		return (List<Student>) studentRepo.findAll();
	}

}
