package com.StudentDetails1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDetails1.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
