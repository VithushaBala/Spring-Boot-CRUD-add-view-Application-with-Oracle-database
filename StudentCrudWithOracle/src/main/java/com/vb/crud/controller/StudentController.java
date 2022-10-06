package com.vb.crud.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vb.crud.service.StudentServiceImpl;

import com.vb.crud.entity.Student;

@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	
	private StudentServiceImpl studentServiceImpl;
	
	
	
	//call saved students or to save new
	@RequestMapping(value = "saveStudent",  method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {
		
		
		System.out.println("saved successfully");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	//get
	@GetMapping(value = "findAllStudents")
	public List<Student> findAllStudents(){
		return studentServiceImpl.findAllStudents();



	}}
