package com.app.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserExceptions {

	static final String USERNAME_PATTERN = "^[a-zA-Z]{2,25}$";
	
	static private Pattern pattern;
	static private Matcher matcher;
	
	public UserExceptions() {
		this.pattern = Pattern.compile(USERNAME_PATTERN);
		System.out.println("in costructor");
	}
	
	static void validateUserName(String userName) throws CustomException{
		pattern = Pattern.compile(USERNAME_PATTERN);
		matcher = pattern.matcher(userName);
        if(matcher.matches()) {
        	System.out.println("username successfully entered");
        }
        else {
        	throw new CustomException("Username is not valid... please correct username");
        }
	}
	
	static void validateAge(int age) throws CustomException{
		if(age<18) {
			throw new CustomException("You are underage...");
		}
		else {
			System.out.println("user age is validated....");
		}
	}
}
