package com.StudentResults.service;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.StudentResults.dao.ResultsDao;
import com.StudentResults.entity.MarkSheet;
import com.StudentResults.entity.Results;
import com.StudentResults.entity.Student;

@Service
public class ResultsService {
	@Autowired
	ResultsDao rd;
	@Autowired
	RestTemplate rt;
	public String post() {
		String url1="http://localhost:8088/student/getAll";
		String url2="http://localhost:8089/markSheet/getAll";
		ResponseEntity<List<Student>>stu=rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<Student>>() {});
		List<Student>student=stu.getBody();
		ResponseEntity<List<MarkSheet>>mar=rt.exchange(url2, HttpMethod.GET, null, new ParameterizedTypeReference<List<MarkSheet>>() {});
		List<MarkSheet>marksheet=mar.getBody();
		List<Results>result=new ArrayList<>();
		for(Student students:student) {
			for(MarkSheet marksheets:marksheet) {
				if(students.getRollno()==marksheets.getRollno()) {
					Results r=new Results();
					r.setRollno(students.getRollno());
					r.setName(students.getName());
					int total=(marksheets.getSem1total()+marksheets.getSem2total())/2;
					r.setTotal(total);
					if(students.getAttendance()>90) {
					if(r.getTotal()>=96) {
						r.setTotal(100);
					}
					else {
						r.setTotal(r.getTotal()+5);
					}
					}
					r.setPercentage(r.getTotal());
					result.add(r);
				}
			}
		}
		return rd.post(result);
	}
}