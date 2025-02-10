package com.StudentDetails1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails1.customException.AgeException;
import com.StudentDetails1.dao.StudentDao;
import com.StudentDetails1.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String post(List<Student>st)  {
		return sd.post(st);
	}
	public String postOne(Student st) throws AgeException{
		if(st.getAge()>18) {
			return sd.postOne(st);
		}
		else {
			throw new AgeException("Age Not Eligible");
		}
	}
	public String update(int id,Student st) {
		return sd.update(id, st);
	}
	public List<Student> getAll() {
		return sd.getAll();
	}
	public String delete(int id) {
		return sd.delete(id);
	}

}
