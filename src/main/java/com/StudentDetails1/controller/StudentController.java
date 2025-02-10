package com.StudentDetails1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails1.customException.AgeException;
import com.StudentDetails1.entity.Student;
import com.StudentDetails1.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/postStudents")
	public String post(@RequestBody List<Student>st) {
		return ss.post(st);
	}
	@PostMapping(value="/postSingle")
	public String postOne(@RequestBody Student st) throws AgeException {
		return ss.postOne(st);
	}
	@PutMapping(value="/update1/{id}")
	public String update(@PathVariable int id,@RequestBody Student st) {
		return ss.update(id, st);
	}
	@GetMapping(value="/getAll")
	public List<Student> getAll(){
		return ss.getAll();
	}
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable int id) {
		return ss.delete(id);
	}

}
