package com.mile1.exception;

 public class NullNameException extends RuntimeException{
	@Override
	public String toString() {
		return "name is null.";
	}
}
