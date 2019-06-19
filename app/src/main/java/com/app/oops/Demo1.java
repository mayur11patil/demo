package com.app.oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
	
	private Pattern pattern;
	private Matcher matcher;
	
	String userName;
	String address;
	String mobNo;
	
	private static final String USERNAME_PATTERN = "^[a-zA-Z]{2,25}$";
	//private static final String USERNAME_PATTERN ="((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})";


	 
    public Demo1(){
        this.pattern = Pattern.compile(USERNAME_PATTERN);
    }

    public boolean validate(final String userName){

        matcher = pattern.matcher(userName);
        return matcher.matches();

    }
	
	public void addUserDetails(String userName, String address, String mobNo){
		if(validate(userName)) {
			this.userName=userName;
			this.address=address;
			this.mobNo=mobNo;
		}
	}
	
	public void showuser() {
		System.out.println("User Details are: "+"userName ="+userName+"\n"+"Address ="+address+"\n"+"Mobile No ="+mobNo);
	}
	
	
}

