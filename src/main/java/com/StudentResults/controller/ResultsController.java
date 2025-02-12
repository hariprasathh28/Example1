package com.StudentResults.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentResults.service.ResultsService;

@RestController
@RequestMapping(value="/Result")
public class ResultsController {
	@Autowired
	ResultsService rs;
	@PostMapping(value="/post")
	public String post() {
		return rs.post();
	}

}
