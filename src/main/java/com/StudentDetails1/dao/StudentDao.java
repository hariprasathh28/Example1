package com.StudentDetails1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails1.entity.Student;
import com.StudentDetails1.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String post(List<Student>st) {
		sr.saveAll(st);
		return "Saved Successfully";
	}
	public String postOne(Student st) {
		sr.save(st);
		return "Saved Successfully";
	}
	public String update(int id,Student st) {
		Student st1=sr.findById(id).get();
		st1.setName(st.getName());
		st1.setRollno(st.getRollno());
		st1.setGender(st.getGender());
		st1.setAge(st.getAge());
		st1.setCourse(st.getCourse());
		st1.setAttendance(st.getAttendance());
		sr.save(st1);
		return "Updated Successfully";
	}
	public List<Student> getAll() {
		return sr.findAll();
	}
	public String delete(int id) {
		sr.deleteById(id);
		return "Deleted Sucessfully";
	}

}
