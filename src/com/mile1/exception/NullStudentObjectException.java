package com.mile1.exception;

public class NullStudentObjectException extends RuntimeException{
	@Override
	public String toString() {
		return "Object is null.";
	}
}
