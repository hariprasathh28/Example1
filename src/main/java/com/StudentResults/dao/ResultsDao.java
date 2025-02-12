package com.StudentResults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResults.entity.Results;
import com.StudentResults.repository.ResultsRepository;

@Repository
public class ResultsDao {
	@Autowired
	ResultsRepository rr;

	public String post(List<Results> result) {
		rr.saveAll(result);
		return "Saved Successfully";
	}



}
