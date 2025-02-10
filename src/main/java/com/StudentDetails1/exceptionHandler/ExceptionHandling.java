package com.StudentDetails1.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.StudentDetails1.customException.AgeException;

@RestControllerAdvice

public class ExceptionHandling {
	
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String> ageExc(AgeException e){
		return new ResponseEntity<>("Please Enter Valid Age",HttpStatus.BAD_REQUEST);
	}

}