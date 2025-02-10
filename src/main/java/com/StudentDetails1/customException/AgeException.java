package com.StudentDetails1.customException;

public class AgeException extends Exception {
	String mes;
	public AgeException(String mes) {
		super(mes);
	}

}
