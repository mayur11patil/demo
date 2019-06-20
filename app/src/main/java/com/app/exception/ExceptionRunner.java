package com.app.exception;

public class ExceptionRunner {
	
	public static void main(String[] args) {
		
		try {
			UserExceptions.validateUserName("mayur");
		}catch(Exception e) {
			System.out.println("Exception occoured"+e);
		}
		
		try {
			UserExceptions.validateAge(12);
		}catch(Exception e) {
			System.out.println("Exception occoured"+e);
		}
		
		finally {
			System.out.println("Finally block executed");
		}
		
	}

}
