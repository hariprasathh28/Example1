package com.MarkSheetDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MarkSheetDetails.entity.MarkSheet;
import com.MarkSheetDetails.service.MarkSheetService;

@RestController
@RequestMapping(value="markSheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;
	@PostMapping(value="/post")
	public String post(@RequestBody List<MarkSheet>m) {
		return ms.post(m);
	}
	@GetMapping(value="/getAll")
	public List<MarkSheet> get(){
		return ms.get();
	}

}
