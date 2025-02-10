package com.MarkSheetDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MarkSheetDetails.entity.MarkSheet;
import com.MarkSheetDetails.repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;
	public String post(List<MarkSheet>m) {
		mr.saveAll(m);
		return "Saved Successfully";
	}
	public List<MarkSheet> get() {
		return mr.findAll();
	}

}
