package com.vb.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vb.crud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
